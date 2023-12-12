package org.example.m2;

import java.util.ArrayList;

public class Configuration {
    private String nomConfiguration;
    private ArrayList<Port> listPortConf;
    private ArrayList<Binding> listBinding;
    private ArrayList<Component> listComponent;
    private ArrayList<Attachement> listAttachement;
    private ArrayList<Connector> listConnector;

    /**
     * @param nomConfiguration
     * @param listPortConf
     * @param listBinding
     * @param listComponent
     * @param listAttachement
     * @param listConnector
     */
    public Configuration(String nomConfiguration, Component component) {
        this.nomConfiguration = nomConfiguration;
        this.listPortConf = new ArrayList<Port>();
        this.listBinding = new ArrayList<Binding>();
        this.listComponent = new ArrayList<Component>();
        this.listComponent.add(component);
        this.listAttachement = new ArrayList<Attachement>();
        this.listConnector = new ArrayList<Connector>();
    }

    /**
     * @return the nomConfiguration
     */
    public String getNomConfiguration() {
        return nomConfiguration;
    }
    /**
     * @return the listBinding
     */
    public ArrayList<Binding> getListBinding() {
        return listBinding;
    }
    /**
     * @param listBinding the listBinding to set
     */
    public void setListBinding(ArrayList<Binding> listBinding) {
        this.listBinding = listBinding;
    }
    /**
     * @return the listComponent
     */
    public ArrayList<Component> getListComponent() {
        return listComponent;
    }
    /**
     * @param listComponent the listComponent to set
     */
    public void setListComponent(ArrayList<Component> listComponent) {
        this.listComponent = listComponent;
    }
    /**
     * @return the listAttachement
     */
    public ArrayList<Attachement> getListAttachement() {
        return listAttachement;
    }
    /**
     * @param listAttachement the listAttachement to set
     */
    public void setListAttachement(ArrayList<Attachement> listAttachement) {
        this.listAttachement = listAttachement;
    }
    /**
     * @return the listConnector
     */
    public ArrayList<Connector> getListConnector() {
        return listConnector;
    }
    /**
     * @param listConnector the listConnector to set
     */
    public void setListConnector(ArrayList<Connector> listConnector) {
        this.listConnector = listConnector;
    }
    /**
     * @param nomConfiguration the nomConfiguration to set
     */
    public void setNomConfiguration(String nomConfiguration) {
        this.nomConfiguration = nomConfiguration;
    }
    /**
     * @return the listPortConf
     */
    public ArrayList<Port> getListPortConf() {
        return listPortConf;
    }
    /**
     * @param listPortConf the listPortConf to set
     */
    public void setListPortConf(ArrayList<Port> listPortConf) {
        this.listPortConf = listPortConf;
    }

}
