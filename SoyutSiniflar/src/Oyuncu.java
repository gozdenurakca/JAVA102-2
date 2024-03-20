public abstract class Oyuncu {
    // soyut sınıf dediğimiz zaman; bu sınıfın gerçek dünyada bir karşılığı yok
    // bu sınıfın amacı kendisinden türeyecek olan alt sınıflar için orta bir katman oluşturmak.
    // abstract sınıfları nesnesi alınamaz.
    private String isim;
    private int numara;

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public abstract void sutCek();

    public abstract void pasVer();
}
