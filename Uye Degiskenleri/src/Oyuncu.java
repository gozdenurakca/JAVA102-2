public class Oyuncu {
    int saglik = 100;
    int oyuncuSayisi = 0;

    public Oyuncu() {
        oyuncuSayisi++;
    }

    void yasam() {
        saglik = 100;
    }
     void darbe() {
        saglik -= 1;
     }

     void oyuncuSayisi() {
         System.out.println(oyuncuSayisi);
     }
}
