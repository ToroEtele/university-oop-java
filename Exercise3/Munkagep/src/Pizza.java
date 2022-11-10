public class Pizza extends Kaja {
    public Pizza(String kajaNev, String ido) {
        super(kajaNev, ido);
    }

    @Override
    void elkeszites() {
        System.out.println("Letrehoztam egy " + getKajaNev() + " pizzat. Elkeszitesi ideje: " + getIdo() + " perc");
    }
}
