public class Ogrenci extends Kisi{
    // ilk, Kisi sınıfından miras aldığımızda uyarı veriyor çünkü
    // Kisi sınıfında parametre alan bir constructor metot tanımlıdır.

    private int numara;
    public Ogrenci(String isim, int numara) {
        super(isim);
        // Öğrenci, kişinin yapıcı metotunu çağırmış bulunmakta.
        // base class'a göndermek için
        // super(); ilk satırda olmalıdır!!
        this.numara = numara;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    public void ozet() {
        System.out.println("Öğrenci numarası : " +numara);
        super.bilgileriYazdir();
    }
}
