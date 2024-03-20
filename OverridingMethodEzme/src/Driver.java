public class Driver {
    public static void main(String[] args) {
        Araba araba = new Araba("X Marka", "Y Model", 2023);
        System.out.println(araba.toString());
        araba.setMarka("Peugeot");
        araba.setModel("2008 Model");
        araba.setYil(2024);
        System.out.println(araba.toString());
    }
}
