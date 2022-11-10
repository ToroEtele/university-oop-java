public class Main {

    public static void main(String[] args) {
        Haromszog h[];
        for(int i = 0; i<10; i++) {
            try {
                h[i] = new Haromszog(4, 5, 6);
                System.out.println("Haromszog sorszama:" + h.haromszogSorszama);
            } catch (HaromszogException e) {
                System.out.println(e);
            }
        }
        System.out.println("Haromszogek osszesen: " + Haromszog.haromszogekSzama);
    }
}
