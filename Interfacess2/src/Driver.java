public class Driver {
    public static void main(String[] args) {
        Yuzebilir yuzebilir = new Balik();
        yuzebilir.yuz();

        Ucabilir ucabilir = new Karga();
        ucabilir.uc();

        Yuruyebilir yuruyebilir = new Karga();
        yuruyebilir.yuru();
    }
}
