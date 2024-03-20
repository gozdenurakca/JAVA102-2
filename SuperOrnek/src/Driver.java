public class Driver {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Gözde Akça");
        System.out.println(kisi.getIsim());

        Ogrenci ogr = new Ogrenci("Nur",123);
        System.out.println(ogr.getIsim());
        System.out.println(ogr.getNumara());
        ogr.ozet();
    }
}
