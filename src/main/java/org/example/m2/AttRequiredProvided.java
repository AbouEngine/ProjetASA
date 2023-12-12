package org.example.m2;

public class AttRequiredProvided extends Attachement{
    private Port portCompRequis;
    private Role roleFournis;

    /**
     * @param portCompRequis
     * @param roleFournis
     */
    public AttRequiredProvided(Port portCompRequis, Role roleFournis) {
        this.portCompRequis = portCompRequis;
        this.roleFournis = roleFournis;
    }

    //public abstract void attachement();

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
    /**
     * @return the roleFournis
     */
    public Role getRoleFournis() {
        return roleFournis;
    }
    /**
     * @param roleFournis the roleFournis to set
     */
    public void setRoleFournis(Role roleFournis) {
        this.roleFournis = roleFournis;
    }

}
