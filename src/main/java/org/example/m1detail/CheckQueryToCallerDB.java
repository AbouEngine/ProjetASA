package org.example.m1detail;

import org.example.m2.AttProvidedRequired;
import org.example.m2.Attachement;
import org.example.m2.Port;
import org.example.m2.Role;

public class CheckQueryToCallerDB extends AttProvidedRequired {
    public CheckQueryToCallerDB(Port portCompFournis, Role roleRequis) {
        super(portCompFournis, roleRequis);

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
                this.getPortCompFournis().setContenue("CheckQuery");
                System.out.println("Etape 11 : Role Caller Cb: "+getRoleRequis().getContenue());
            }
        }
    }

}
