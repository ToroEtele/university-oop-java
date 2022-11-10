public class Main {

    public static void main(String[] args) {
/*
        Jarmu bicikli = new Jarmu(2, 15.0);
        System.out.print("Bicikli kerekeinek szama: ");
        System.out.println(bicikli.getKerekszam());
        System.out.print("Bicikli kerekterhelese: ");
        System.out.println(bicikli.kerekterheles());

        Gepkocsi trabant = new Gepkocsi(4, 600.0, 4);
        System.out.print("Trabant kerekeinek szama: ");
        System.out.println(trabant.getKerekszam());

        Teherauto ifa = new Teherauto(6, 1200.0, 2,2500.0);
        System.out.print("Max. kerekterheles: ");
        System.out.println(ifa.kerekterheles());

        Gepkocsi audi = new Gepkocsi(4, 800.0, 7);
        System.out.println("Az audi kerekterhelese: " + audi.kerekterheles());
        System.out.println(audi.toString());

        Gepkocsi renault = new Gepkocsi(4, 1600, 1, "CJ72TKN");
        System.out.println(renault.toString());
        renault.beszall(2);
        System.out.println(renault.toString());
        renault.kiszall(4);
        System.out.println(renault.toString());

        Teherauto egyJarmu = new Teherauto(6, 2000, 2, 0);
        System.out.println("A teherauto kerekterhelese: " + egyJarmu.kerekterheles());
        System.out.println(egyJarmu.toString());
        egyJarmu.felpakol(5000);
        egyJarmu.felpakol(500);
        System.out.println(egyJarmu.toString());
        egyJarmu.lepakol(5000);
        egyJarmu.lepakol(500);

        Jarmu[] jarmuvek = new Jarmu[3];
        jarmuvek[0] = new Gepkocsi(4, 2000, 5, "CJ03XOS");
        jarmuvek[1] = new Teherauto(6, 3000, 2, 0);
        jarmuvek[2] = new Teherauto(8, 4000, 3, 0);
*/
        Jarmu[] jarmuvek = {
         new Gepkocsi(4, 2000, 5, "CJ03XOS"),
         new Teherauto(6, 3000, 2, 0),
         new Teherauto(8, 4000, 3, 0)
        };

//        for(int i = 0; i< jarmuvek.length; i++)
//        {
//            System.out.println(jarmuvek[i].kerekterheles());
//        }

        for (Jarmu jarmu : jarmuvek)
        {
            System.out.println(jarmu.kerekterheles());
        }
    }
}


