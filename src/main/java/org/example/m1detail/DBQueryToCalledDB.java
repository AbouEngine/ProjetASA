package org.example.m1detail;

import org.example.m2.AttRequiredProvided;
import org.example.m2.Attachement;
import org.example.m2.Port;
import org.example.m2.Role;

public class DBQueryToCalledDB extends AttRequiredProvided {
    public DBQueryToCalledDB(Port portCompRequis, Role roleFournis) {
        super(portCompRequis, roleFournis);
        this.start();
    }

    public void run() {
        this.attachement();
    }
    public void attachement() {
        while(true) {

            String[] port = this.getRoleFournis().getContenue().split("::");

            if(port[0].compareTo("Server")==0) {
                this.getPortCompRequis().setContenue(this.getRoleFournis().getContenue());
                this.getRoleFournis().setContenue("calledDB");
                System.out.println("Etape 17 : DBQtoCDB - DBQuery: "+getPortCompRequis().getContenue());
            }
        }

    }

}
