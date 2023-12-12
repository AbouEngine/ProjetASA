package org.example.m1detail;

import org.example.m2.Connector;
import org.example.m2.Role;

public class CMtoSM extends Connector {
    public CMtoSM(String nomConnector) {
        super(nomConnector, new Role("calledCM"),new Role("callerSM"));
        this.start();

    }

    public void run() {
        this.glue();
    }

    public void glue() {
        while(true) {
            String[] port = this.getRoleRequis().getContenue().split("::");
            if(port[0].compareTo("Client0")==0) {
                this.getRoleFournis().setContenue((this.getRoleRequis().getContenue()));
                this.getRoleRequis().setContenue("callerSM");
                System.out.println("Etape 8 : CMtoSM - calledCM : "+getRoleFournis().getContenue());
            }
        }
    }

}
