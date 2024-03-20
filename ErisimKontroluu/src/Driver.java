public class Driver {
    public static void main(String[] args) {
        /*
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Gözde Nur";
        ogrenci.soyad = "Akça";
        ogrenci.numara = 1;
         */
        Ogrenci ogr = new Ogrenci();
        ogr.ad = "Gözde Nur";
        ogr.soyad = "Akça";
        ogr.numara = 1234;
        ogr.durum = "Lisans";

        ogr.setYas(23);
        ogr.bilgileriYazdir();

    }
}
