package org.example.m1;

import org.example.m1detail.ServerDetail;
import org.example.m2.Component;
import org.example.m2.Port;

public class Server extends Component {
    public Server(String nomComponent) {
        super(nomComponent);
        this.getListPortCompFournis().add(new Port("receiveRequest"));
        ServerDetail sDetail = new ServerDetail("serveurDetail",this.getListPortCompFournis().get(0));
        this.setConfiguration(sDetail);
    }


    public String service(String requete) {
        return requete;
    }

}
