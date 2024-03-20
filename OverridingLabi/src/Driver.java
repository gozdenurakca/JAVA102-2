public class Driver {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("1","Gözde Nur");
        System.out.println(kisi.toString());
        Kisi kisi2 = new Kisi("1","Nur");
        System.out.println(kisi2.toString());

        System.out.println(kisi == kisi2);
        // referans tipler bellekteki adreslerinin karşılaştırılması yapılıyor.
        // bu iki nesne "new" ile ayrı ayrı oluştuu için bellekteki adresleri farklı olacaktır.

        System.out.println(kisi.equals(kisi2));
        // equals metodunun varsayılan davranışı "==" ile aynıdır.
        // dolayısıyla "equals" metodunu @Overrider edersek işlem başarılı olur.
    }

}
