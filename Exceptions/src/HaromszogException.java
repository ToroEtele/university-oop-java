public class HaromszogException extends Exception{
    protected double a;
    protected double b;
    protected double c;
    public HaromszogException(double a, double b, double c) {
        super("Nem haromszög!");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString() {
        return "Nem alkot haromszöget: " + a + b + c;
    }

}
