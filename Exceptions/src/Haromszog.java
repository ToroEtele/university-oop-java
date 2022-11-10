public class Haromszog {
    private double a;
    private double b;
    private double c;
    public static int haromszogekSzama=0;
    public int haromszogSorszama=0;

    public Haromszog(double a, double b, double c) throws HaromszogException {
        try {
            if (a <= 0 || b <= 0 || c <= 0){
                throw new NegativOldalHosszException(a, b, c);
            }
            else if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
                this.a = a;
                this.b = b;
                this.c = c;
                haromszogSorszama = ++haromszogekSzama;
            }
            else {
                throw new NemHaromszogException(a, b, c);
            }
        }
        catch (HaromszogException h) {
            throw h;
        }
    }
    public double kerulet() {
        return a + b + c;
    }

    public double terulet() {
        double s = (a+b+c)/2;
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }
}
