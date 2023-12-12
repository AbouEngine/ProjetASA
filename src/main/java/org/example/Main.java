package org.example;

import org.example.m1.Client;
import org.example.m1.ModuleCS;
import org.example.m1.Server;

public class Main {
    public static void main(String[] args) {
        Server myServer = new Server("myServer");
        ModuleCS mySystem = new ModuleCS("mySystel",myServer);

        Client myClient = (Client) mySystem.getListComponent().get(1);
        String r = myClient.service("1+1");
        System.out.println(r);
    }


}