public class Main {

    public static void main(String[] args) {
        Point point;
        point = new Point(10,10);   //peldanyosítás az implicit konstruktorral

        point.setX(3);
        point.setY(2);

//        System.out.println("( " + point.getX() + ":" + point.getY() + " )");
//        Point originOne = new Point(23,94);
//        Rectangle rectOne = new Rectangle(originOne, 100, 200);
//        Rectangle rectTwo = new Rectangle(50, 100);
//        System.out.println("Width of rectOne: " + rectOne.getWidth());
//        System.out.println("Height of rectOne: " + rectOne.getHeight());
//        System.out.println("Area of rectOne: " + rectOne.area());
//
//        rectTwo.setOrigin(originOne);
//        System.out.println("X position of rectOne: " + rectTwo.getOrigin().getX());
//        System.out.println("Y position of rectOne: " + rectTwo.getOrigin().getY());
//
//        System.out.println("Move rectOne to 40:72");
//        rectTwo.move(40, 72);
//        System.out.println("X position of rectOne: " + rectTwo.getOrigin().getX());
//        System.out.println("Y position of rectOne: " + rectTwo.getOrigin().getY());
//
//        System.out.println("Number of points: " + Point.getNumberOfPoints());
//        System.out.println("Number of rectangles: " + Rectangle.getNrOfRectangles());
//        System.out.println("rectOne nr: " + rectOne.getNumber());
//        System.out.println("rectTwo nr: " + rectTwo.getNumber());


        Shape shapes[] = {new Rectangle(new Point(0,0), 15 ,20),
                new Rectangle(new Point(0,0), 15 ,20),
                new Circle(new Point(0,0), 15)};
        System.out.println("Number of rectangles: " + Rectangle.getNrOfRectangles());

    }
}
