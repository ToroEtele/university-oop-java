public class Termek {
    private String nev;
    private String kod;
    double egysegAr;

    public Termek(String nev, String kod,double egysegAr){
            try {
                this.nev = nev;
                this.kod = kod;
                if (egysegAr >= 0){
                    this.egysegAr = egysegAr;
                }else {
                    throw new Exception("Negativ egyszegar nem megengedett");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public double getEgysegAr() {
        return egysegAr;
    }

    public void setEgysegAr(double egysegAr) {
        this.egysegAr = egysegAr;
    }

    @Override
    public String toString() {
        return "Termek{" +
                "nev='" + nev + '\'' +
                ", kod='" + kod + '\'' +
                ", egysegAr=" + egysegAr +
                '}';
    }
}
