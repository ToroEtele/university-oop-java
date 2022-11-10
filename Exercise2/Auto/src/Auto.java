public class Auto {
    private String rendszam;
    private String marka;
    private int gyartasiEv;
    private double maxSebesseg;

    public Auto(String rendszam, String marka, int gyartasiEv) {
        this.rendszam = rendszam;
        this.marka = marka;
        this.gyartasiEv = gyartasiEv;
    }

    public static Auto minimum(Auto []arr){
        Auto oregebb = arr[0];
        int minJelen = arr[0].getGyartasiEv();
        for(Auto i : arr){
            if (i.getGyartasiEv() < minJelen){
                minJelen = i.getGyartasiEv();
                oregebb = i;
            }
        }
        return oregebb;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", marka='" + marka + '\'' +
                ", gyartasiEv=" + gyartasiEv +
                ", maxSebesseg=" + maxSebesseg +
                '}';
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public double getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(double maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }
}
