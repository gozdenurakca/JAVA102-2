import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        calisan.setIsim("Gözde Nur");
        calisan.setMaas(30000);
        calisan.setIseGirisTarihi(new Date());

        System.out.println(calisan.getIsim());
        System.out.println(calisan.getMaas());
        System.out.println(calisan.getIseGirisTarihi());

    }
}
