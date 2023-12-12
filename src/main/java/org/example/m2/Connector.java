package org.example.m2;

public class Connector extends Thread{
    private String nomConnector;
    private Role roleFournis;
    private Role roleRequis;

    /**
     * @param nomConnector
     * @param roleFournis
     * @param roleRequis
     */
    public Connector(String nomConnector, Role roleFournis, Role roleRequis) {
        this.nomConnector = nomConnector;
        this.roleFournis = roleFournis;
        this.roleRequis = roleRequis;
    }

    /**
     * @return the nomConnector
     */
    public String getNomConnector() {
        return nomConnector;
    }

    /**
     * @param nomConnector the nomConnector to set
     */
    public void setNomConnector(String nomConnector) {
        this.nomConnector = nomConnector;
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

    //public abstract void glue();

}
