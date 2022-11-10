import java.text.Format;
import java.util.Scanner;

public class NobelDijas implements Comparable{
    private String nev;
    private String orszag;
    private String szakterulet;
    private int evszam;

    public NobelDijas(String _Nev, String _Orszag,
                      String _Szakterulet, int _Evszam){
        nev = _Nev;
        orszag = _Orszag;
        szakterulet = _Szakterulet;
        evszam = _Evszam;
    }

    public String getSzakterulet(){
        return szakterulet;
    }

    public int getEvszam(){
        return evszam;
    }

    public boolean equals(Object obj){
        NobelDijas dijas = (NobelDijas) obj;

        return (evszam==dijas.evszam) &&
                (szakterulet.equals(dijas.getSzakterulet()));
    }

    public int compareTo(Object obj){
        return evszam - ((NobelDijas)obj).evszam;
    }

    public String toString() {
        String ret = String.format("%-20s %10s %20s %n", nev, orszag, evszam);
        return ret;
    }

}
