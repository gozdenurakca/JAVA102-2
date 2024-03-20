public class Kare extends Sekil {
    private int kenarUzunlugu;

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }
    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void alanHesapla() {
        System.out.println("Karenin Alanı : " + kenarUzunlugu*kenarUzunlugu);
    }
}