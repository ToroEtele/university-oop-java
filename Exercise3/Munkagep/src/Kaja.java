public abstract class Kaja {
    private String kajaNev;
    private String ido;

    public Kaja(String kajaNev, String ido) {
        this.kajaNev = kajaNev;
        this.ido = ido;
    }

    abstract void elkeszites();

    public String getKajaNev() {
        return kajaNev;
    }

    public void setKajaNev(String kajaNev) {
        this.kajaNev = kajaNev;
    }

    public String getIdo() {
        return ido;
    }

    public void setIdo(String ido) {
        this.ido = ido;
    }
}
