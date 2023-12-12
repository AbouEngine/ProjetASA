package org.example.m1;

import org.example.m2.AttProvidedRequired;
import org.example.m2.Port;
import org.example.m2.Role;

public class SendCaller extends AttProvidedRequired {
    public SendCaller(Port portCompFournis, Role roleRequis) {
        super(portCompFournis, roleRequis);
        this.start();
    }

    public void run() {
        attachement();
    }
    public void attachement() {
        while(true) {
            String[] portAller = this.getPortCompFournis().getContenue().split("::");
            String[] portRetour = this.getRoleRequis().getContenue().split("::");

            if(portAller[0].compareTo("Client0")==0) {
                this.getRoleRequis().setContenue(this.getPortCompFournis().getContenue());
                this.getPortCompFournis().setContenue("sendRequest");
                System.out.println("Etape 2: SendCaller-Role caller :"+this.getRoleRequis().getContenue());
            }
            if(portRetour[0].compareTo("Server")==0) {
                this.getPortCompFournis().setContenue(this.getRoleRequis().getContenue());
                this.getRoleRequis().setContenue("caller");
                System.out.println("Etape 22 : sendCaller-portSendRequest"+this.getPortCompFournis().getContenue());
            }
        }
    }

}
