public class Elma {
    public Elma(int agirlik, String renk) {
        this.agirlik = agirlik;
        this.renk = renk;
    }
    private String renk;
    private int agirlik;

    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getRenk() {
        return renk;
    }
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    public int getAgirlik() {
        return agirlik;
    }
}