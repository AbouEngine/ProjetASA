package org.example.m1detail;

import org.example.m2.Connector;
import org.example.m2.Role;

public class SMtoDB extends Connector {
    public SMtoDB(String nomConnector) {
        super(nomConnector, new Role("calledSM"),new Role("callerDB"));

        this.start();

    }

    public void run() {
        this.glue();
    }

    public void glue() {
        while(true) {
            String[] port = this.getRoleRequis().getContenue().split("::");
            if(port[0].compareTo("Client0")==0) {
                this.getRoleFournis().setContenue(this.getRoleRequis().getContenue());
                this.getRoleRequis().setContenue("callerDB");
                System.out.println("Etape 12 : SMtoDB - CalledSM: "+getRoleFournis().getContenue());
            }
        }
    }

}
