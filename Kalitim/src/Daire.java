public class Daire extends Sekil {
    // her daire bir şekildir.
    private int yaricap;

    public int getYaricap() {
        return yaricap;
    }
    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    public void alanHesapla() {
        System.out.println("Dairenin Alanı : " + (Math.PI * yaricap * yaricap));
    }
}