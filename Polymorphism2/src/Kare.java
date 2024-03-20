public class Kare extends Sekil{
    private int kenarUzunlugu;

    //Constructor Metot:
    public Kare(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }
    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }
    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }
    public void alan() {
        System.out.println("Kare Alanı : " + Math.pow(kenarUzunlugu,2));


    }
}
