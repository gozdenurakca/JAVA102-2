public class Calisan {
    private String isim;
    private String gorev;
    private int maas;

    public Calisan(String ad, String is,int para) {
        isim = ad;
        gorev = is;
        maas = para;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String ad) {
        isim = ad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String is) {
        gorev = is;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int para) {
        maas = para;
    }

    public void ozet() {
        System.out.println("Çalışanın ismi  : " + isim);
        System.out.println("Çalışanın işi   : " + gorev);
        System.out.println("Çalışanın maaşı : " + maas);
    }
}
