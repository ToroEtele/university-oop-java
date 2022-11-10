public class Main {
    public static void main(String[] args) {
        Auto audi = new Auto("CJ99RIM", "Audi", 2009);
        Auto skoda = new Auto("CJ99RYM", "Skoda", 2005);
        Auto bmw = new Auto("CJ95RIM", "BMW", 2017);
        Auto dacia = new Auto("B99GIM", "Dacia", 1995);

        Auto[] tomb = new Auto[4];
        tomb[0] = audi;
        tomb[1] = skoda;
        tomb[2] = bmw;
        tomb[3] = dacia;

        Auto legoregebb = Auto.minimum(tomb);


        System.out.println("A legoregebb auto: " + legoregebb);
    }
}