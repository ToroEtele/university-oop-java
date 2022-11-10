public class Main {
    public static void main(String[] args) {
        Munkagep gep1 = new Munkagep("Gep125",30,5);
        gep1.megteszX(10);
        System.out.println(gep1);
        gep1.megteszY(13);
        System.out.println(gep1);
        gep1.elmegy(0,0);
        System.out.println(gep1);


        Pizza calzone = new Pizza("Calzone","50");
        Pizza margherita = new Pizza("Margerita","120");
        calzone.elkeszites();
        margherita.elkeszites();
    }
}