public class Rectangle extends Shape{
    private int width = 0;
    private int height = 0;

    private static int nrOfRectangles = 0;
    private int number;

    public Rectangle() {
        origin = new Point(0, 0);
        number = ++nrOfRectangles;
    }

    public Rectangle(Point p) {
        origin = p;
        number = ++nrOfRectangles;
    }

    public Rectangle(int w, int h) {
        this(new Point(0, 0), w, h);
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
        number = ++nrOfRectangles;
    }


//    SETTERS AND GETTERS

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

//    NUMBERS

    public static int getNrOfRectangles() {
        return nrOfRectangles;
    }

    public int getNumber() {
        return number;
    }

    @Override
    double area() {
        return width*height;
    }

    @Override
    double perimeter() {
        return 2*(width+height);
    }

}
