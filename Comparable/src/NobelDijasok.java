import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class NobelDijasok {
    private Vector szakteruletek = new Vector();
    private Vector dijasok = new Vector();

    Scanner in = new Scanner(System.in);

    // Szakterületek felvitele végjelig. Két egyenlő nem lehet:

    void felvitelSzakteruletek() {
        String szakterulet;

        while (true) {
            System.out.print("Szakterulet: ");
            szakterulet = in.nextLine();

            if (szakterulet.equals(""))
                return;
            if (szakteruletek.indexOf(szakterulet) >= 0)
                System.out.println("Már van ilyen");
            else
                szakteruletek.add(szakterulet);
        }
    }

    void felvitelSzakterulet(String _szakterulet) {
        if (szakteruletek.indexOf(_szakterulet) >= 0) {
            System.out.println("Már van ilyen: " + _szakterulet);
            return;
        }
        else
            szakteruletek.add(_szakterulet);
    }

    void felvitelDijasok() {
        String nev, orszag, szakterulet;
        int evszam;
        NobelDijas dijas;

        System.out.println("\n*** Nobel díjasok felvitele ***");

        while (true) {
            System.out.print("Szakterulet: ");
            szakterulet = in.nextLine();
            if (szakterulet.equals(""))
                break;
            if (szakteruletek.indexOf(szakterulet) < 0) {
                System.out.println("Nincs ilyen szakterület");
                continue;
            }

            System.out.print("Évszám: ");
            evszam = Integer.parseInt(in.nextLine());

            dijas = new NobelDijas("", "", szakterulet, evszam);

            if (dijasok.contains(dijas)) {
                System.out.println("Ilyen szakterület + év már van!");
                continue;
            }

            System.out.print("Név: ");
            nev = in.nextLine();

            System.out.print("Ország: ");
            orszag = in.nextLine();

            dijas = new NobelDijas(nev, orszag, szakterulet, evszam);
            dijasok.add(dijas);
        }

        Collections.sort(dijasok);
    }

    void felvitelDijas( String _nev, String _orszag, String _szakterulet, int _evszam) {
        if (szakteruletek.indexOf(_szakterulet) < 0) {
            System.out.println("Nincs ilyen szakterület");
            return;
        }

        NobelDijas dijas = new NobelDijas("", "", _szakterulet, _evszam);

        if (dijasok.contains(dijas)) {
            System.out.println("Ilyen szakterület + év már van!");
            return;
        }

        dijas = new NobelDijas(_nev, _orszag, _szakterulet, _evszam);
        dijasok.add(dijas);
    }

    void listaDijasok() {
        System.out.println("\n********** Nobel díjasok **********\n");

        System.out.printf("%-10s %20s %20s %n %n", "Név", "Ország", "Évszám");


        for (int i = 0; i < dijasok.size(); i++) {
            System.out.println((NobelDijas) dijasok.get(i));
        }
    }

    void listaSzakteruletSzerint() {
        NobelDijas dijas;
        String szakterulet;

        System.out.println("***********Lista szakterület szerint***********");

        System.out.print("\nAdjon meg egy szakteruletet: ");
        szakterulet = in.nextLine();

        if (szakteruletek.indexOf(szakterulet) < 0) {
            System.out.println("Nincs ilyen szakterület");
            return;
        }

        System.out.printf("%-10s %20s %20s %n %n", "Név", "Ország", "Évszám");

        for (int i = 0; i < dijasok.size(); i++) {
            dijas = (NobelDijas) dijasok.get(i);
            if (szakterulet.equals(dijas.getSzakterulet()))
                System.out.println(dijas);
        }
    }

    void evszamGyujtes() {
        int[] gyujto = new int[2030];
        for (int i = 0; i < dijasok.size(); i++) {
            int ev = ((NobelDijas) dijasok.get(i)).getEvszam();
            gyujto[ev]++;
        }
        System.out.println("\n**********Nobel díjasok száma év szerint**********\n");
        for (int ev = 0; ev < gyujto.length; ev++) {
            if (gyujto[ev] != 0)
                System.out.printf("%-10s %10s %n", ev, gyujto[ev]);
        }
    }
}