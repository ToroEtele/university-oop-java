public class Munkagep {
    private String azonosito;
    private int x;
    private int y;

    public Munkagep(String azonosito, int x, int y) {
        this.azonosito = azonosito;
        this.x = x;
        this.y = y;
    }

    public Munkagep(String azonosito) {
        this.azonosito = azonosito;
    }

    public Munkagep(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Munkagep{" +
                "azonosito='" + azonosito + '\'' +
                ", pozicio=(" + x + ", " + y + ") "+'}';
    }

    public void megteszX(int tav){
        this.x += tav;
    }

    public void megteszY(int tav){
        this.y += tav;
    }

    public void elmegy(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
