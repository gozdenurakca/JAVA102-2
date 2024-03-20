import java.util.Date;
public class Calisan {
    private String isim;
    private double maas;
    private Date iseGirisTarihi;
    // import java.util.Date; bunu yazmadığın zaman Date sınıfının altını çizer çünkü import etmemiş olursun.

    // değişkenin değerini değiştirmek için -> set metodu
    public void setIsim(String s) {
        isim = s;
    }

    //değişkenin değerini geri döndürmek için -> get metodu
    public String getIsim() {
        return isim;
    }

    public void  setMaas(double d) {
        maas = d;
    }
    public double getMaas() {
        return maas;
    }
    public void setIseGirisTarihi(Date d) {
        iseGirisTarihi = d;
    }
    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }

}
