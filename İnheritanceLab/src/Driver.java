import com.sun.security.jgss.GSSUtil;

public class Driver {
    public static void main(String[] args) {

        Kisi kisi = new Kisi();
        kisi.setIsim("Gözde Nur Akça");
        System.out.println(kisi.getIsim());

        System.out.println();

        Ogrenci ogr = new Ogrenci();
        ogr.setIsim("Gizem");
        ogr.setDers("Matematik");
        System.out.println(ogr.getIsim());
        System.out.println(ogr.getDers());

        System.out.println();

        UniversiteOgrenci uniOgr = new UniversiteOgrenci();
        uniOgr.setIsim("Mehmet Yıldız");
        uniOgr.setDers("Bilgisayar Temelleri-101");
        uniOgr.setKampüs("Maltepe");
        System.out.println(uniOgr.getIsim());
        System.out.println(uniOgr.getDers());
        System.out.println(uniOgr.getKampüs());

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Ahmet Yıldız");
        ogretmen.setOkul("Maltepe Üniversitesi");
        System.out.println(ogretmen.getIsim());
        System.out.println(ogretmen.getOkul());

        System.out.println();

        Doktor dr = new Doktor();
        dr.setIsim("Ela Nur");
        dr.setBrans("Plastik Cerrahi");
        System.out.println(dr.getIsim());
        System.out.println(dr.getBrans());
    }
}
