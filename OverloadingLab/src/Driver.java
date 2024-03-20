import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        Calisan calisan2 = new Calisan("IT");
        Calisan calisan3 = new Calisan("IT", "Gözde Nur");
        Calisan calisan4 = new Calisan("IT","Gözde Nur", new Date());
        calisan.bilgileriYazdir();
        calisan2.bilgileriYazdir();
        calisan3.bilgileriYazdir();
        calisan4.bilgileriYazdir();
    }
}
