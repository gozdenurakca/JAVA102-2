import java.util.Date;

public class Calisan {
    private String isim;
    private String bolum;
    private Date iseGiris;

    public Calisan() {

    }
    public Calisan(String bolum) {
        this.bolum = bolum;
    }
    public Calisan(String bolum, String isim) {
        this.bolum = bolum;
        this.isim = isim;

    }
    public Calisan(String bolum, String isim, Date iseGiris) {
        this.bolum = bolum;
        this.isim = isim;
        this.iseGiris = iseGiris;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public Date getIseGiris() {
        return iseGiris;
    }
    public void setIseGiris(Date iseGiris) {
        this.iseGiris = iseGiris;
    }

    public void bilgileriYazdir() {
        System.out.println("İsim : " + isim);
        System.out.println("Bölüm : " + bolum);
        System.out.println("İşe giriş tarihi : " + iseGiris);
        System.out.println("***********");
    }
}
