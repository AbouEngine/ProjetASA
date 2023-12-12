package org.example.m1;

import org.example.m2.Component;
import org.example.m2.Port;

public class Client extends Component {
    public Client(String nomComponent) {
        super(nomComponent);
        this.getListPortCompRequis().add(new Port("sendRequest"));
    }

    public String service(String requete) {
        String send =  this.getNomComponent()+"::"+requete;
        this.getListPortCompRequis().get(0).setContenue(send);
        System.out.println("Etape 1 : Client - sendRequest :"+this.getListPortCompRequis().get(0).getContenue());
        String[] receiver = this.getListPortCompRequis().get(0).getContenue().split("::");
        while(receiver[0].compareTo("Server")!=0) {
            receiver = this.getListPortCompRequis().get(0).getContenue().split("::");
        }
        System.out.println("Etape 23 : Client - sendRequest(answer) :"+this.getListPortCompRequis().get(0).getContenue());
        String receive = receiver[1];
        this.getListPortCompRequis().get(0).setContenue("sendRequest");
        return receive;
    }

}
