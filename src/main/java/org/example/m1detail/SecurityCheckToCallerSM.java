package org.example.m1detail;

import org.example.m2.AttProvidedRequired;
import org.example.m2.Attachement;
import org.example.m2.Port;
import org.example.m2.Role;

public class SecurityCheckToCallerSM extends AttProvidedRequired {
    public SecurityCheckToCallerSM(Port portCompFournis, Role roleRequis) {
        super(portCompFournis, roleRequis);
        // TODO Auto-generated constructor stub
        this.start();
    }

    public void run() {
        this.attachement();
    }

    public void attachement() {
        while(true) {
            String[] port = this.getPortCompFournis().getContenue().split("::");
            if(port[0].compareTo("Client0")==0) {
                this.getRoleRequis().setContenue(this.getPortCompFournis().getContenue());
                this.getPortCompFournis().setContenue("SecurityCheck");
                System.out.println("Etape 7 : SCtoCSM - CallerSM :"+this.getRoleRequis().getContenue());
            }
        }

    }

}
