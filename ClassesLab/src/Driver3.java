public class Driver3 {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        kopek.isim = "Bella";
        kopek.cins = "Doberman";
        kopek.yas = 4;
        kopek.renk = KopekRenk.SIYAH;
        kopek.boyut = KopekBoyut.BUYUK;

        kopek.yemekYe();
        kopek.otur();;
        kopek.kos();
        kopek.uyu();
    }
}
