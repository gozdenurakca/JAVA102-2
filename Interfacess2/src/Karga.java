public class Karga implements Ucabilir, Yuruyebilir{
    @Override
    public void uc() {
        System.out.println("Kargalar uçabilir.");
    }
    @Override
    public void yuru() {
        System.out.println("Kargalar yürüyebilir.");
    }
}
