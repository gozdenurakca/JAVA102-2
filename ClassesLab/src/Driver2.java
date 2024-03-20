public class Driver2 {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        telefon.marka = "Apple";
        telefon.model = "Iphone 14";
        telefon.tip = TelefonTipi.CEP;
        telefon.wifi = true;
        telefon.mobilVeri = true;

        telefon.aramaYap("1233454353");
        telefon.aramayiSonlandir();
        telefon.mesajGonder("Günaydınlar...");

        System.out.println();

        Telefon tel = new Telefon();
        tel.marka = "Samsung";
        tel.model = "S7";
        tel.tip = TelefonTipi.CEP;
        tel.wifi = true;
        tel.mobilVeri = true;

        tel.aramayiSonlandir();
        tel.mesajGonder("Nasılsın ? ");
    }
}
