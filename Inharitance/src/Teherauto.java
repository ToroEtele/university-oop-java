public class Teherauto  extends Jarmu{
    private int szemelyek;
    private double raksuly;

    public Teherauto (int k, double s, int szem,double rs)
    {
        super(k,s);
        szemelyek = szem;
        raksuly = rs;
    }

    public void felpakol(int kg)
    {
        if( kg+raksuly > 5000)
        {
            System.out.println("Maximum 5 tonna fer fel.");
        }
        else
        {
        raksuly+=kg;
        }
    }

    public void lepakol(int kg)
    {
        if(raksuly < kg)
        {
            raksuly-=kg;
        }
        else if(raksuly == kg)
        {
            raksuly = 0;
            System.out.println("A teherauto teljesen kiurult");
        }
        else
        {
            System.out.println("Nem pakolhatunk le tobbet mint ami rajta van.");
        }
    }

    @Override
    public double kerekterheles()
    {
        return (getSuly() + raksuly + szemelyek*60) /
                getKerekszam();
    }

    @Override
    public String toString() {
        return "Teherauto{" +
                "szemelyek=" + szemelyek +
                ", raksuly=" + raksuly +
                '}';
    }
}
