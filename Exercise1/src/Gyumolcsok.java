public class Gyumolcsok extends Termek implements Akciozhato{
    public Gyumolcsok(String nev, String kod, double egysegAr) {
        super(nev, kod, egysegAr);
    }

    @Override
    public double akciosAr(int kedvezmeny) {
        return  (this.egysegAr - this.egysegAr*(kedvezmeny/100));
    }
}
