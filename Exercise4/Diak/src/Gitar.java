public class Gitar extends HurosHangszer{
    public Gitar(int hurokSzama) {
        super(hurokSzama);
    }

    @Override
    public void szol() {
        System.out.println("Szol a gitar");
    }
}
