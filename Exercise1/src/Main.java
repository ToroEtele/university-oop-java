import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Csapat> csapatok = new ArrayList<>();
        csapatok.add(new Csapat("csapat1"));
        csapatok.add(new Csapat("csapat2"));
        csapatok.add(new Csapat("csapat3"));

        for (int i = 0; i < csapatok.size(); i++){
            csapatok.get(i).setOsszpontSzam(i);
            System.out.println(csapatok.get(i));
        }

        for (int i = 0; i < csapatok.size(); i++){
            zsuriz(csapatok.get(i),csapatok.get(i).getOsszpontSzam());
        }

        Gyumolcsok alma = new Gyumolcsok("alma","alma001",12.5);
        System.out.println("Akcios ar: " + alma.akciosAr(10));

    }
    static void zsuriz(Csapat csapat, int pontSzam) {
        csapat.setOsszpontSzam(csapat.getOsszpontSzam() + pontSzam);
    }
}