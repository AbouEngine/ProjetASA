package org.example.m2;

public class AttProvidedRequired extends Attachement{
    private Port portCompFournis;
    private Role roleRequis;

    /**
     * @param portCompFournis
     * @param roleRequis
     */
    public AttProvidedRequired(Port portCompFournis, Role roleRequis) {
        this.portCompFournis = portCompFournis;
        this.roleRequis = roleRequis;
    }

    //public abstract void attachement();

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
    /**
     * @return the roleRequis
     */
    public Role getRoleRequis() {
        return roleRequis;
    }
    /**
     * @param roleRequis the roleRequis to set
     */
    public void setRoleRequis(Role roleRequis) {
        this.roleRequis = roleRequis;
    }

}
