public class Driver {
    public static void main(String[] args) {

        Elma[] elmalar = new Elma[10];
        elmalar[0] = new Elma(10, "Sarı");
        elmalar[1] = new Elma(20, "Kırmızı");
        elmalar[2] = new Elma(30, "Yeşil");
        elmalar[3] = new Elma(40, "Sarı");
        elmalar[4] = new Elma(50, "Yeşil");
        elmalar[5] = new Elma(60, "Kırmızı");
        elmalar[6] = new Elma(70, "Sarı");
        elmalar[7] = new Elma(80, "Kırmızı");
        elmalar[8] = new Elma(90, "Yeşil");
        elmalar[9] = new Elma(100, "Kırmızı");

        /*renkFiltrele("Kırmızı", elmalar);
        System.out.println("-----");
        agirlikFiltrele(50, elmalar);
        System.out.println("-----");
        agirlikFiltrele2(40, elmalar);

         */
        RenkFiltresi renkFiltresi = new RenkFiltresi();
        filtrele(renkFiltresi,elmalar);
        System.out.println("****");
        AgirlikFiltresi agirlikFiltresi = new AgirlikFiltresi();
        filtrele(agirlikFiltresi,elmalar);

        ElmaFiltresi elmaFiltresi = new RenkFiltresi();
        filtrele(renkFiltresi,elmalar);
        // veya
        ElmaFiltresi elmaFiltresi1 = new AgirlikFiltresi();
        filtrele(agirlikFiltresi,elmalar);


    }

    public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getAgirlik() >= agirlik) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }

    public static void agirlikFiltrele2(int agirlik, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getAgirlik() <= agirlik) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }

        }
    }
    public static void renkFiltrele(String renk, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getRenk().equals(renk)) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }

        }
    }

    public static void filtrele(ElmaFiltresi elmaFiltresi, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length ; i++) {
            Elma elma = elmalar[i];
            if(elmaFiltresi.filtrele(elma)) {
                System.out.println(elma.getAgirlik() + " " + elma.getRenk());
            }
        }
    }
}