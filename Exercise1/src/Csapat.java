

//1.Hozzátok létre a Csapat osztályt! A csapatnak van neve, csapattagok neve és összpontszáma.
// A létrehozáskor csapatnév megadása legyen kötelező, a többi nem. Az adattagok eléréséhez írjatok
// settereket és gettereket!
// Hozzátok létre a zsuriz osztályszintű metódust, amely egy X csapatnak Y pontszámot ad.
// Ezután hozzatok létre egy adatszerkezetet,
// melynek elemei csapatok (példányok), a zsűri pontozza őket, majd írjátok ki a nyertes
// csapat adatait! (4p.)
public class Csapat {

    private String csapatNev;
    private String csapatTagNev;
    private int osszpontSzam;

    public Csapat(String csapatNev) {
        this.csapatNev = csapatNev;
    }



    @Override
    public String toString() {
        return "Csapat{" +
                "csapatNev='" + csapatNev + '\'' +
                ", csapatTagNev='" + csapatTagNev + '\'' +
                ", osszpontSzam=" + osszpontSzam +
                '}';
    }

    public String getCsapatNev() {
        return csapatNev;
    }

    public void setCsapatNev(String csapatNev) {
        this.csapatNev = csapatNev;
    }

    public String getCsapatTagNev() {
        return csapatTagNev;
    }

    public void setCsapatTagNev(String csapatTagNev) {
        this.csapatTagNev = csapatTagNev;
    }

    public int getOsszpontSzam() {
        return osszpontSzam;
    }

    public void setOsszpontSzam(int osszpontSzam) {
        this.osszpontSzam = osszpontSzam;
    }
}
