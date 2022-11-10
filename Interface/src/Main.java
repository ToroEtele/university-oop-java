import static MiniMelo.fonokFelAdat;
import static MiniMelo.penzugyesFizetestAd;

public class Main {

    public static void main(String[] args) {
        Alkalmazott melos = new Alkalmazott("Béla","szerelő");
        fonokFelAdat(melos,"felugyelo");
        penzugyesFizetestAd(melos, 2000);

        System.out.println("Alkalmazott: \n" + "Fizetes: " + melos.getFizetes()
        + "\n" + "Feladat: " + melos.getFeladat());
    }
}
