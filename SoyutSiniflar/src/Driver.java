public class Driver {
    public static void main(String[] args) {
        Oyuncu oyuncu = new Futbolcu();
        // oyuncu sınıfı abstract class olduğu için nesnelendirilemez fakat oyuncu sınıfından inheritance alan
        // sınıf nesnelendirilebilir !
        oyuncu.setIsim("Alican");
        oyuncu.setNumara(10);
        oyuncu.pasVer();
        oyuncu.sutCek();
        System.out.println("****");

        Oyuncu oyuncu2 = new Basketbolcu();
        oyuncu2.setIsim("Alican");
        oyuncu2.setNumara(10);
        oyuncu2.pasVer();
        oyuncu2.sutCek();
    }
}
