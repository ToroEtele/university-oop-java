public class Main {
    public static void main(String[] args) {
        Diak diak1 = new Diak(4163,"Eke Samuel", "Gazdinfo");
        diak1.vizsgazik("OOP",5,true);
        System.out.println(diak1);
        diak1.vizsgazik("Linux",6,false);
        System.out.println(diak1);

        HurosHangszer hurosHangszer = new HurosHangszer(4);
        //a HurosHangszer osztalyban levo szol methodus fut
        hurosHangszer.szol();

        Hegedu hegedu1 = new Hegedu(4);
        //Hegedu osztalybol szarmazo felulirott methodus hivodik meg
        hegedu1.szol();

    }
}