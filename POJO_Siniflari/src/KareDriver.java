public class KareDriver {
    public static void main(String[] args) {
        Kare kare = new Kare();
        kare.setX(10);
        kare.setY(-5); // y nin değeri 0 olarak basılacaktır.
        kare.setUzunluk(100);
        kare.ekranaBastir();


        System.out.println(kare.getX());

    }
}
