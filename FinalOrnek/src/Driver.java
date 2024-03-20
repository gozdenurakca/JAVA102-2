public class Driver {
    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci(1);
        System.out.println(ogr.getNumara());

        UniOgrenci ogr2 = new UniOgrenci(3);
        System.out.println(ogr2.getNumara());
        ogr2.yazdir();
    }
}
