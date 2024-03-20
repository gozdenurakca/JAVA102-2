public class Ogrenci {
    public int numara = 10;
    public String ad;
    public String soyad;
    public String durum;
    private int yas;

    public void setYas(int y) {
        if(y > 0) {
            yas = y;
        } else {
            System.out.println("Yaş değeri 0'dan küçük olamaz!");
        }
    }
    public void bilgileriYazdir() {
        System.out.println("Öğrenci numarası : " + numara);
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Öğrenim durumu : " + durum);
        System.out.println("Yaş: : " + yas);
    }

}
