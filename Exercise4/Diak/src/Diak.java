public class Diak {
    private int azonositoSzam;
    private String nev;
    private String szakIrany;
    private int osszKreditSzam;

    public Diak(int azonositoSzam, String nev, String szakIrany) {
        this.azonositoSzam = azonositoSzam;
        this.nev = nev;
        this.szakIrany = szakIrany;
    }

    public void vizsgazik(String tantargy, int kreditSzam, boolean tud) {
        if (tud) {
            this.osszKreditSzam += kreditSzam;
            System.out.println("A " + getAzonositoSzam() + " azonositoju diak atment a " + tantargy + "-bol");

        } else {
            System.out.println("A " + getAzonositoSzam() + " azonositoju diak megbukott a " + tantargy + "-bol");
        }
    }

    @Override
    public String toString() {
        return "Diak{" +
                "azonositoSzam=" + azonositoSzam +
                ", nev='" + nev + '\'' +
                ", szakIrany='" + szakIrany + '\'' +
                ", osszKreditSzam=" + osszKreditSzam +
                '}';
    }

    public int getAzonositoSzam() {
        return azonositoSzam;
    }

    public void setAzonositoSzam(int azonositoSzam) {
        this.azonositoSzam = azonositoSzam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzakIrany() {
        return szakIrany;
    }

    public void setSzakIrany(String szakIrany) {
        this.szakIrany = szakIrany;
    }

    public int getOsszKreditSzam() {
        return osszKreditSzam;
    }

    public void setOsszKreditSzam(int osszKreditSzam) {
        this.osszKreditSzam = osszKreditSzam;
    }
}
