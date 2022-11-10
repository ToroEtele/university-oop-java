public class Gepkocsi extends Jarmu{
    private int szemelyek;
    private String rendszam;

    public Gepkocsi(int k, double s, int szem)
    {
        this(k, s, szem, "ismeretlen");
    }

    public Gepkocsi(int k, double s, int szem, String rendsz)
    {
        super(k, s);
        szemelyek = szem;
        rendszam = rendsz;
    }

    public void beszall(int nr)
    {
        szemelyek +=nr;
    }

    public void kiszall(int nr)
    {
        if (szemelyek >= nr)
            szemelyek-=nr;
        else
            System.out.println("Nem szallhat ki tobb ember mint ahany bent van.");
    }
    @Override
    public double kerekterheles() {
        System.out.println("Szemelzek nelkuli kerekterheles: " + super.kerekterheles());
        return ((getSuly() + szemelyek * 60)/getKerekszam());
    }

    @Override
    public String toString() {
        return "Gepkocsi{" +
                "kerekekSzama=" + getKerekszam() + ", " +
                "suly=" + getSuly() + ", " +
                "szemelyek=" + szemelyek + ", " +
                "rendszam=" + rendszam +
                '}';
    }
}
