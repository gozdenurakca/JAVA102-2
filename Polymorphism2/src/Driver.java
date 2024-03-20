public class Driver {
    public static void main(String[] args) {
        /*Sekil sekil = new Sekil();
        sekil.alan();

        Kare kare = new Kare(10);
        kare.alan();

        Daire daire = new Daire(10);
        daire.alan();

        Dikdortgen dikdortgen = new Dikdortgen(20,10);
        dikdortgen.alan();*/

        // Polimorfik yapı :

        Sekil sekil = new Kare(10);
        sekil.alan();
        Sekil sekil2 = new Daire(10);
        sekil2.alan();
        Sekil sekil3 = new Dikdortgen(10,10);
        sekil3.alan();


    }
}
