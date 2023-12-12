package org.example.m2;

import java.util.ArrayList;

public class Component extends Thread{
    private String nomComponent;
    private Configuration configuration;
    private ArrayList<Port> listPortCompRequis;
    private ArrayList<Port> listPortCompFournis;
    private ArrayList<String> propertie;
    private ArrayList<String> constraint;

    /**
     * @param nomComponent
     * @param configuration
     * @param listServiceFournis
     * @param listServiceRequis
     * @param listPortCompRequis
     * @param listPortCompFournis
     * @param propertie
     * @param constraint
     */
    public Component(String nomComponent) {
        this.nomComponent = nomComponent;
        this.configuration = null;
        this.listPortCompRequis = new ArrayList<Port>();
        this.listPortCompFournis = new ArrayList<Port>();
        this.propertie = new ArrayList<String>();
        this.constraint = new ArrayList<String>();
    }

    //public abstract String service(String requete);// liste de service

    /**
     * @return the nomComponent
     */
    public String getNomComponent() {
        return nomComponent;
    }
    /**
     * @param nomComponent the nomComponent to set
     */
    public void setNomComponent(String nomComponent) {
        this.nomComponent = nomComponent;
    }
    /**
     * @return the configuration
     */
    public Configuration getConfiguration() {
        return configuration;
    }
    /**
     * @param configuration the configuration to set
     */
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
    /**
     * @return the listPortCompRequis
     */
    public ArrayList<Port> getListPortCompRequis() {
        return listPortCompRequis;
    }
    /**
     * @param listPortCompRequis the listPortCompRequis to set
     */
    public void setListPortCompRequis(ArrayList<Port> listPortCompRequis) {
        this.listPortCompRequis = listPortCompRequis;
    }
    /**
     * @return the listPortCompFournis
     */
    public ArrayList<Port> getListPortCompFournis() {
        return listPortCompFournis;
    }
    /**
     * @param listPortCompFournis the listPortCompFournis to set
     */
    public void setListPortCompFournis(ArrayList<Port> listPortCompFournis) {
        this.listPortCompFournis = listPortCompFournis;
    }
    /**
     * @return the propertie
     */
    public ArrayList<String> getPropertie() {
        return propertie;
    }
    /**
     * @param propertie the propertie to set
     */
    public void setPropertie(ArrayList<String> propertie) {
        this.propertie = propertie;
    }
    /**
     * @return the constraint
     */
    public ArrayList<String> getConstraint() {
        return constraint;
    }
    /**
     * @param constraint the constraint to set
     */
    public void setConstraint(ArrayList<String> constraint) {
        this.constraint = constraint;
    }

}
