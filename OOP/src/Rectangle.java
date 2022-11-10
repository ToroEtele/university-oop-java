public class Rectangle {
    private int width = 0;
    private int height = 0;
    private Pont origin;

    private static int negyszogekSzama = 0;
    private int sorszam;

    public Rectangle() {
        origin = new Pont(0, 0);
        sorszam = ++negyszogekSzama;
    }

    public Rectangle(Pont p) {
        origin = p;
        sorszam = ++negyszogekSzama;
    }

    public Rectangle(int w, int h) {
        this(new Pont(0, 0), w, h);
    }

    public Rectangle(Pont p, int w, int h) {
        origin = p;
        width = w;
        height = h;
        sorszam = ++negyszogekSzama;
    }

    public void move(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }

    public int area() {
        return width * height;
    }

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

    public Pont getOrigin() {
        return origin;
    }

    public void setOrigin(Pont origin) {
        this.origin = origin;
    }

    public static int getNegyszogekSzama() {
        return negyszogekSzama;
    }

    public int getSorszam() {
        return sorszam;
    }
}
