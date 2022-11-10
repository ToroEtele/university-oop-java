public class Jarmu {
    private int kerekek;
    private double suly;

    public Jarmu()
    {
        this(4, 1000);
    }

    public Jarmu(int k, double s)
    {
        kerekek = k;
        suly = s;
    }

    public int getKerekszam (){return kerekek;}

    public double getSuly() {return suly;}

    public double kerekterheles()
    {
        return suly / kerekek;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "kerekek=" + kerekek +
                ", suly=" + suly +
                '}';
    }
}
