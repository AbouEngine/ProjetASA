package org.example.m1detail;

import org.example.m2.Connector;
import org.example.m2.Role;

public class DBtoCM extends Connector {
    public DBtoCM(String nomConnector) {
        super(nomConnector, new Role("calledDB"),new Role("callerCM"));

        this.start();

    }

    public void run() {
        this.glue();
    }

    public void glue() {
        while(true) {
            String[] port = this.getRoleRequis().getContenue().split("::");
            if(port[0].compareTo("Server")==0) {
                this.getRoleFournis().setContenue(this.getRoleRequis().getContenue());
                this.getRoleRequis().setContenue("callerCM");
                System.out.println("Etape 16 : DBtoCm - calledDB: "+getRoleFournis().getContenue());
            }
        }
    }

}
