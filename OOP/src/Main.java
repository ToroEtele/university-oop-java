public class Main {

    public static void main(String[] args) {

        Pont egyPont;
        egyPont = new Pont(10,10);   //peldanyosítás az implicit konstruktorral

        /*
        egyPont.setX(100);
        egyPont.setY(100);

        System.out.println("( " + egyPont.getX() + ":" + egyPont.getY() + " )");
        */
        Pont originOne = new Pont(23,94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        System.out.println("Width of rectOne: " + rectOne.getWidth());
        System.out.println("Height of rectOne: " + rectOne.getHeight());
        System.out.println("Area of rectOne: " + rectOne.area());

        rectTwo.setOrigin(originOne);
        System.out.println("X position of rectOne: " + rectTwo.getOrigin().getX());
        System.out.println("Y position of rectOne: " + rectTwo.getOrigin().getY());

        System.out.println("Move rectOne to 40:72");
        rectTwo.move(40, 72);
        System.out.println("X position of rectOne: " + rectTwo.getOrigin().getX());
        System.out.println("Y position of rectOne: " + rectTwo.getOrigin().getY());

        System.out.println("Number of points: " + Pont.getPontokSzama());
        System.out.println("Number of rectangles: " + Rectangle.getNegyszogekSzama());
        System.out.println("rectOne nr: " + rectOne.getSorszam());
        System.out.println("rectTwo nr: " + rectTwo.getSorszam());
    }
}
