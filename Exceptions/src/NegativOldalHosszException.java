public class NegativOldalHosszException extends HaromszogException{
    public NegativOldalHosszException(double a, double b, double c) {
        super(a, b, c);
    }

    public String toString() {
        return "Legalább egy negatív oldal: "+ a + b + c;
    }
}
