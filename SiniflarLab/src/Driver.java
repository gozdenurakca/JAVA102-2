public class Driver {
    public static void main(String[] args) {
        Kalem kursunkalem = new Kalem();
        kursunkalem.marka = "Faber-Castell";
        kursunkalem.silinebilirlik = true;
        kursunkalem.doldurulabilirlik = false;
        kursunkalem.tip = "Kurşun Kalem";
        kursunkalem.renk = "Kırmızı";

        kursunkalem.tekrarDoldur();
        kursunkalem.yaz("Merhabalar..");
        kursunkalem.sil();


        System.out.println();

        Kalem dolmakalem = new Kalem();
        dolmakalem.marka = "NewPencils";
        dolmakalem.renk = "Siyah";
        dolmakalem.tip = "Dolma Kalem";
        dolmakalem.doldurulabilirlik = true;
        dolmakalem.silinebilirlik = false;
        dolmakalem.tekrarDoldur();
        dolmakalem.yaz("Dolma kalemler renk renktir.");
        dolmakalem.sil();

    }
}
