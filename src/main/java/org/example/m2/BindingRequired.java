package org.example.m2;

public class BindingRequired extends Binding{
    private Port portConfRequis;
    private Port portCompRequis;

    /**
     * @param portConfRequis
     * @param portCompRequis
     */
    public BindingRequired(Port portConfRequis, Port portCompRequis) {
        this.portConfRequis = portConfRequis;
        this.portCompRequis = portCompRequis;
    }

    /**
     * @return the portConfRequis
     */
    public Port getPortConfRequis() {
        return portConfRequis;
    }
    /**
     * @param portConfRequis the portConfRequis to set
     */
    public void setPortConfRequis(Port portConfRequis) {
        this.portConfRequis = portConfRequis;
    }
    /**
     * @return the portCompRequis
     */
    public Port getPortCompRequis() {
        return portCompRequis;
    }
    /**
     * @param portCompRequis the portCompRequis to set
     */
    public void setPortCompRequis(Port portCompRequis) {
        this.portCompRequis = portCompRequis;
    }

}
