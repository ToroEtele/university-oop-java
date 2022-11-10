public abstract class Shape {
    protected Point origin;

    abstract double area();
    abstract double perimeter();

    public void move(int x, int y){
        origin.setX(x);
        origin.setY(y);
    }
}
