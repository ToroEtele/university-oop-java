public class NemHaromszogException extends HaromszogException {
    public NemHaromszogException(double a,double b, double c) {
        super(a, b, c);
    }
    public String toString() {
        return "Nem teljesül a háromszög egyenlőtlenség: " + a + ", " + b + ", " + c;
    }
}