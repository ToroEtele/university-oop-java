public class Alkalmazott implements IPenzugy, IFeladat{
    private String nev;
    private String beosztas;
    private String feladat;
    private int fizetes;

    public Alkalmazott(String nev, String beosztas){
        this.nev = nev;
        this.beosztas = beosztas;
    }
    public int getFizetes(){
        return fizetes;
    }
    public void setFizetes(int befiz){
        fizetes = befiz;
    }

    public String getFeladat(){
        return feladat;
    }
    public void setFeladat(String befelad){
        feladat = befelad;
    }

    public String toString(){
        return nev+" "+beosztas;
    }
}
