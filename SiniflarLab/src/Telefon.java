public class Telefon {
    TelefonTipi tip;
    String marka;
    String model;
    boolean mobilVeri;
    boolean wifi;
    boolean aramaVarMi;

    void aramaYap(String telefonNumarasi) {
        System.out.println(telefonNumarasi);
        aramaVarMi = true;
    }
    void aramayiSonlandir() {
        if (aramaVarMi) {
            System.out.println("Arama sonlandırıldı.");
        }
    }
    void mesajGonder(String mesaj) {
        if(mobilVeri || wifi) {
            System.out.println("Mesaj gönderildi.");
            System.out.println("Mesaj içeriği : " + mesaj);
        }
    }


}
