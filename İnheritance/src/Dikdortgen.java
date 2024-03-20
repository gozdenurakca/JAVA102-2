public class Dikdortgen extends Sekil{
    // her dikdörtgen bir şekildir.
    private int uzunluk;
    private int yukseklik;

    public int getUzunluk() {
        return uzunluk;
    }
    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
    public int getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public void alanHesapla() {
        System.out.println("Dikdörtgenin Alanı : " + yukseklik*uzunluk);
    }
}