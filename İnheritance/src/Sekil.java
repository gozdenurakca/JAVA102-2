public class Sekil {
    /*
    her şekil bir daire değildir,
    her şekil bir kare değildir,
    her şekil bir dikdörtgen değildir
    fakat;
    her daire bir şekildir,
    her kare bir şekildir,
    her dikdörtgen bir şekildir.
     */
    private String renk;
    private int posX;
    private int posY;

    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void alanHesapla() {
        System.out.println("Şeklin Alanı Hesaplanamadı.");
    }
}