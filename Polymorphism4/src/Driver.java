public class Driver {
    public static void main(String[] args) {
        /*Keman keman = new Keman();
        keman.cal();
        keman.akortYap();*/

        Enstruman ens = new Gitar();
        ens.cal();
        ens.akortYap();
        Enstruman ens2 = new Keman();
        ens2.cal();
        ens2.akortYap();
        Enstruman ens3 = new Davul();
        ens3.cal();
        ens3.akortYap();
        Enstruman ens4 = new Klarnet();
        ens4.cal();
        ens4.akortYap();

    }
}
