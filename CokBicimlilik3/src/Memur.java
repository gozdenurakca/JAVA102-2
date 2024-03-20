public class Memur extends Calisan{
    private String birim;
    public Memur(String isim, String gorev, int maas,String brm) {
        super(isim,gorev,maas);
        birim = brm;
    }
    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }
    public void ozet() {
        System.out.println("Memur isim : " + getIsim());
        System.out.println("Memurun görevi : " + getGorev());
        System.out.println("Memurun maaşı : " + getMaas());
        System.out.println("Memurun birimi : " + birim);
    }
}
