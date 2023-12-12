package org.example.m1detail;

import org.example.m2.Component;
import org.example.m2.Port;

import java.util.ArrayList;

public class SecurityManager extends Component {
    ArrayList<String> nameClient;

    public SecurityManager(String nom) {
        super(nom);
        nameClient = new ArrayList<String>();
        nameClient.add("Client0");
        this.getListPortCompFournis().add(new Port("CheckQuery"));
        this.getListPortCompRequis().add(new Port("SecurityAuthentification"));

        this.start();
    }

    public void run() {
        this.serviceSM();
    }

    public String service(String requete) {
        return requete;
    }

    public void serviceSM() {
        while(true) {
            String[] port = this.getListPortCompRequis().get(0).getContenue().split("::");
            if(port[0].compareTo("Client0")==0) {
                if(nameClient.contains(port[0])) {
                    this.getListPortCompFournis().get(0).setContenue(this.getListPortCompRequis().get(0).getContenue());
                    System.out.println("Etape 10 : SM - Port CheckQuery: "+getListPortCompFournis().get(0).getContenue());

                    this.getListPortCompRequis().get(0).setContenue("SecurityAuthentification");
                }
                else {
                    this.getListPortCompFournis().get(0).setContenue("Client0::errorAuthentification");
                    this.getListPortCompRequis().get(0).setContenue("SecurityAuthentification");

                }
            }
        }
    }

}
