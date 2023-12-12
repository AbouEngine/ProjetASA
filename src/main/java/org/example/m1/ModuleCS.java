package org.example.m1;

import org.example.m2.Configuration;

public class ModuleCS extends Configuration {
    public ModuleCS(String nomConfiguration, Server server) {
        super(nomConfiguration, server);
        Client client = new Client("Client0");
        this.getListComponent().add(client);
        RPC link = new RPC("RPC");
        this.getListConnector().add(link);
        ReceiveCalled rCalled = new ReceiveCalled(server.getListPortCompFournis().get(0),
                link.getRoleFournis());
        this.getListAttachement().add(rCalled);
        SendCaller sCaller = new SendCaller(client.getListPortCompRequis().get(0),
                link.getRoleRequis());
        this.getListAttachement().add(sCaller);

    }

}
