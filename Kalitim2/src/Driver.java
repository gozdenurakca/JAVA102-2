public class Driver {
    public static void main(String[] args) {

        NakliyeAraci nakliye = new NakliyeAraci();
        nakliye.setUretici("X Marka");
        nakliye.setYukKapasitesi(1000);

        Tir tir = new Tir();
        tir.setUretici("Y Marka");
        tir.setYukKapasitesi(2000);
        tir.setKonteynirSayisi(20);

    }
}
