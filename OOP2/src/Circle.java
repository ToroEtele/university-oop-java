//p*r^2 2pr
public class Circle extends Shape{
    private int r;
    private static int nrOfCircles;
    private int number;

    public Circle(Point origin, int r) {
        this.origin = origin;
        this.r = r;

        number = ++nrOfCircles;
    }

    public Circle(int r) {
        this(new Point(0,0), r);
    }

//    GETTERS

    public Point getOrigin() {
        return origin;
    }

    public int getR() {
        return r;
    }

    public int getNumber() {
        return number;
    }

    public static int getNrOfCircles() {
        return nrOfCircles;
    }

//    SETTERS

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI*r*r;
    }

    @Override
    double perimeter() {
        return Math.PI*r*2;
    }

    @Override
    public String toString() {
        return "Circle : " +
                "origin=(" + origin.getX() + ":" + origin.getY() + ") " +
                ", r=" + r +
                " , number=" + number +
                '.';
    }
}
