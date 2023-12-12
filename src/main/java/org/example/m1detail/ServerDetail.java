package org.example.m1detail;

import org.example.m2.Configuration;
import org.example.m2.Port;

public class ServerDetail extends Configuration {
    public ServerDetail(String nomConfiguration, Port portConf) {
        super(nomConfiguration, new SecurityManager("SecurityManager"));
        this.getListComponent().add(new ConnectionManager("ConnectionManager"));
        this.getListComponent().add(new DataBase("DataBase"));

        this.getListPortConf().add(portConf);// nb port conf = nb client ?

        this.getListConnector().add(new CMtoSM("CMtoSM"));
        this.getListConnector().add(new DBtoCM("DBtoCM"));
        this.getListConnector().add(new SMtoDB("SMtoDB"));

        this.getListBinding().add(new ReceiverRequestExternalSocket(this.getListPortConf().get(0),
                this.getListComponent().get(1).getListPortCompRequis().get(0)));

        this.getListAttachement().add(new CheckQueryToCallerDB(this.getListComponent().get(0).getListPortCompFournis().get(0),
                this.getListConnector().get(2).getRoleRequis()));
        this.getListAttachement().add(new QueryInterrogationToCallerCM(this.getListComponent().get(2).getListPortCompFournis().get(0),
                this.getListConnector().get(1).getRoleRequis()));
        this.getListAttachement().add(new SecurityCheckToCallerSM(this.getListComponent().get(1).getListPortCompFournis().get(0),
                this.getListConnector().get(0).getRoleRequis()));


        this.getListAttachement().add(new DBQueryToCalledDB(this.getListComponent().get(1).getListPortCompRequis().get(1),
                this.getListConnector().get(1).getRoleFournis()));
        this.getListAttachement().add(new SecurityAuthentificationToCalledCM(this.getListComponent().get(0).getListPortCompRequis().get(0),
                this.getListConnector().get(0).getRoleFournis()));
        this.getListAttachement().add(new SecurityManagementToCalledSM(this.getListComponent().get(2).getListPortCompRequis().get(0),
                this.getListConnector().get(2).getRoleFournis()));
    }

}
