import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        NobelDijasok nd = new NobelDijasok();

        nd.felvitelSzakterulet("Fizika");
        nd.felvitelSzakterulet("Matek");
        nd.felvitelSzakterulet("Kémia");
        nd.felvitelSzakterulet("Béke");

        nd.felvitelDijas("James Peebles", "Amerika", "Fizika", 2019);
        nd.felvitelDijas("Arthur Askhin", "Amerika", "Fizika", 2018);
        nd.felvitelDijas("Benjamin List", "Német", "Kémia", 2021);
        nd.felvitelDijas("Barack Obama", "Amerika", "Béke", 2009);

        int t = 1, get;
        Scanner in = new Scanner(System.in);

        do {
            clearScreen();
            System.out.println("\n ************ Válassz feladatot! ************\n");
            System.out.println("1. Szakterületek hozzáadása.");
            System.out.println("2. Nóbel-díjasok hozzáadása hozzáadása.");
            System.out.println("3. Összes Nóbel-díjas.");
            System.out.println("4. Nóbel-díjasok egy kategódiából.");
            System.out.println("5. Nóbel díjasok száma évenként.");
            System.out.print("Adja meg a feladat sorszámát:  ");
            t = in.nextInt();

            switch (t) {
                case 1:
                    clearScreen();
                    nd.felvitelSzakteruletek();
                    System.out.print("Kilépés (0) Folytatás (Bármi más) :  ");
                    get = in.nextInt();
                    break;
                case 2:
                    clearScreen();
                    nd.felvitelDijasok();
                    System.out.print("Kilépés (0) Folytatás (Bármi más) :  ");
                    get = in.nextInt();
                    break;
                case 3:
                    clearScreen();
                    nd.listaDijasok();
                    System.out.print("Kilépés (0) Folytatás (Bármi más) :  ");
                    get = in.nextInt();
                    break;
                case 4:
                    clearScreen();
                    nd.listaSzakteruletSzerint();
                    System.out.print("Kilépés (0) Folytatás (Bármi más) :  ");
                    get = in.nextInt();
                    break;
                case 5:
                    clearScreen();
                    nd.evszamGyujtes();
                    System.out.print("Kilépés (0) Folytatás (Bármi más) :  ");
                    get = in.nextInt();
                    break;
            }
        }while(t !=0 );
    }
}
