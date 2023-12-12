package org.example.m2;

public class BindingProvided extends Binding{
    private Port portConfFournis;
    private Port portCompFournis;

    /**
     * @param portConfFournis
     * @param portCompFournis
     */
    public BindingProvided(Port portConfFournis, Port portCompFournis) {
        this.portConfFournis = portConfFournis;
        this.portCompFournis = portCompFournis;
    }

    //public abstract void binding();
    /**
     * @return the portConfFournis
     */
    public Port getPortConfFournis() {
        return portConfFournis;
    }
    /**
     * @param portConfFournis the portConfFournis to set
     */
    public void setPortConfFournis(Port portConfFournis) {
        this.portConfFournis = portConfFournis;
    }
    /**
     * @return the portCompFournis
     */
    public Port getPortCompFournis() {
        return portCompFournis;
    }
    /**
     * @param portCompFournis the portCompFournis to set
     */
    public void setPortCompFournis(Port portCompFournis) {
        this.portCompFournis = portCompFournis;
    }

}
