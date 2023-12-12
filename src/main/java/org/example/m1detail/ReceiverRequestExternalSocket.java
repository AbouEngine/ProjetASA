package org.example.m1detail;

import org.example.m2.Binding;
import org.example.m2.BindingRequired;
import org.example.m2.Port;

public class ReceiverRequestExternalSocket extends BindingRequired {
    public ReceiverRequestExternalSocket(Port portConfRequis, Port portCompRequis) {
        super(portConfRequis, portCompRequis);
        this.start();
    }

    public void run() {
        this.binding();
    }


    public void binding() {
        while(true) {
            String[] portAller = this.getPortConfRequis().getContenue().split("::");
            String[] portRetour = this.getPortCompRequis().getContenue().split("::");

            if(portAller[0].compareTo("Client0")==0) {
                this.getPortCompRequis().setContenue(this.getPortConfRequis().getContenue());
                this.getPortConfRequis().setContenue("receiveRequest");
                System.out.println("Etape 5 : Binding - Port ExternalSocket :"+this.getPortCompRequis().getContenue());

            }

            if(portRetour[0].compareTo("Server")==0) {
                this.getPortConfRequis().setContenue(this.getPortCompRequis().getContenue());
                this.getPortCompRequis().setContenue("ExternalSocket");
                System.out.println("Etape 19 : Binding - Port receiveRequest: "+getPortConfRequis().getContenue());
            }
        }
    }

}
