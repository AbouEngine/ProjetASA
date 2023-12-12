package org.example.m1;

import org.example.m2.Connector;
import org.example.m2.Role;

public class RPC extends Connector {
    public RPC(String nomConnector) {
        super(nomConnector, new Role("called"), new Role("caller"));
        this.start();

    }

    public void run () {
        this.glue();
    }

    public void glue() {
        while(true) {
            String[] portAller = this.getRoleRequis().getContenue().split("::");
            String[] portRetour = this.getRoleFournis().getContenue().split("::");

            if(portAller[0].compareTo("Client0")==0) {
                this.getRoleFournis().setContenue((this.getRoleRequis().getContenue()));
                this.getRoleRequis().setContenue("caller");
                System.out.println("Etape 3 : RPC - Role called :"+this.getRoleFournis().getContenue());
            }
            if(portRetour[0].compareTo("Server")==0) {
                this.getRoleRequis().setContenue((this.getRoleFournis().getContenue()));
                this.getRoleFournis().setContenue("called");
                System.out.println("Etape 21 : RPC - Role caller :"+this.getRoleRequis().getContenue());
            }

        }
    }

}
