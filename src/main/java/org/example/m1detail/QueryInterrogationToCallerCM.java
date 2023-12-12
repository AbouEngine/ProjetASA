package org.example.m1detail;

import org.example.m2.AttProvidedRequired;
import org.example.m2.Attachement;
import org.example.m2.Port;
import org.example.m2.Role;

public class QueryInterrogationToCallerCM extends AttProvidedRequired {
    public QueryInterrogationToCallerCM(Port portCompFournis, Role roleRequis) {
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
            if(port[0].compareTo("Server")==0) {
                this.getRoleRequis().setContenue(this.getPortCompFournis().getContenue());
                this.getPortCompFournis().setContenue("QueryInterrogation");
                System.out.println("Etape 15 : QItoCCM - callerCM: "+getRoleRequis().getContenue());
            }
        }
    }

}
