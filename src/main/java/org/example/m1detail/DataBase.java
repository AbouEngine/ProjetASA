package org.example.m1detail;

import org.example.m2.Component;
import org.example.m2.Port;

public class DataBase extends Component {
    public DataBase(String nom) {
        super(nom);
        this.getListPortCompFournis().add(new Port("QueryInterrogation"));
        this.getListPortCompRequis().add(new Port("SecurityManagement"));

        this.start();
    }

    public void run() {
        this.serviceDB();
    }

    public String service(String requete) {
        return requete;
    }


    public void serviceDB() {
        while(true) {
            String[] port = this.getListPortCompRequis().get(0).getContenue().split("::");
            if(port[0].compareTo("Client0")==0) {
                if(port[1].compareTo("errorAuthentification")!=0) {
                    //hashmap>
                    if(port[1].compareTo("1+1")==0) {
                        this.getListPortCompFournis().get(0).setContenue("Server::2");
                    }else {
                        this.getListPortCompFournis().get(0).setContenue("Server::ErrorMapping");
                    }
                }else {
                    this.getListPortCompFournis().get(0).setContenue(this.getListPortCompRequis().get(0).getContenue());
                }
                this.getListPortCompRequis().get(0).setContenue("SecurityManagement");
                System.out.println("Etape 14 : DataBase - QueryInterrogation: "+this.getListPortCompFournis().get(0).getContenue());
            }
        }
    }

}
