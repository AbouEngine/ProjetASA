package org.example.m1;

import org.example.m2.AttRequiredProvided;
import org.example.m2.Port;
import org.example.m2.Role;

public class ReceiveCalled extends AttRequiredProvided {
    public ReceiveCalled(Port portCompRequis, Role roleFournis) {
        super(portCompRequis, roleFournis);
        this.start();

    }

    public void run() {
        this.attachement();
    }

    public void attachement() {
        while(true) {
            String[] portAller = this.getRoleFournis().getContenue().split("::");
            String[] portRetour = this.getPortCompRequis().getContenue().split("::");

            if(portAller[0].compareTo("Client0")==0){
                this.getPortCompRequis().setContenue(this.getRoleFournis().getContenue());
                this.getRoleFournis().setContenue("called");
                System.out.println("Etape 4 : ReceiveCaller-PortReceiveResquest : "+this.getPortCompRequis().getContenue());

            }
            if(portRetour[0].compareTo("Server")==0) {
                this.getRoleFournis().setContenue(this.getPortCompRequis().getContenue());
                this.getPortCompRequis().setContenue("receiveRequest");
                System.out.println("Etape 20 : ReceiveCaller-Rolecalled : "+this.getRoleFournis().getContenue());
            }
        }
    }

}
