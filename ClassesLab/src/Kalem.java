public class Kalem {
        String marka;
        String renk;
        String tip;
        boolean doldurulabilirlik;
        boolean silinebilirlik;

        void yaz(String metin) {
            System.out.println(metin);
        }
        void tekrarDoldur() {
            if (doldurulabilirlik) {
                System.out.println("Kalem dolduruldu");
            } else {
                System.out.println("Bu kalem doldurulamaz..");
            }
        }
        void sil() {
            if (silinebilirlik) {
                System.out.println("Yazı silindi");
            } else  {
                System.out.println("Bu yazı silinemedi.");
            }
        }
}