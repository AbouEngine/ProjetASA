package org.example.m1detail;

import org.example.m2.Component;
import org.example.m2.Port;

public class ConnectionManager extends Component {
    public ConnectionManager(String nom) {
        super(nom);
        this.getListPortCompFournis().add(new Port("SecurityCheck"));
        this.getListPortCompRequis().add(new Port("ExternalSocket"));
        this.getListPortCompRequis().add(new Port("DBQuery"));

        this.start();
    }

    public void run() {
        this.serviceExtToSecurity();
    }
    public String service(String requete) {
        return requete;
    }

    public void serviceExtToSecurity() {
        while(true) {
            String[] portAller = this.getListPortCompRequis().get(0).getContenue().split("::");
            String[] portRetour = this.getListPortCompRequis().get(1).getContenue().split("::");

            if(portAller[0].compareTo("Client0")==0) {
                this.getListPortCompFournis().get(0).setContenue(this.getListPortCompRequis().get(0).getContenue());
                this.getListPortCompRequis().get(0).setContenue("ExternalSocket");
                System.out.println("Etape 6 : CM - SecurityCheck :"+this.getListPortCompFournis().get(0).getContenue());
            }

            if(portRetour[0].compareTo("Server")==0) {
                this.getListPortCompRequis().get(0).setContenue( this.getListPortCompRequis().get(1).getContenue());
                this.getListPortCompRequis().get(1).setContenue("DBQuery");
                System.out.println("Etape 18 - CM-ExternalSocket: "+getListPortCompRequis().get(0).getContenue());
            }
        }
    }

}
