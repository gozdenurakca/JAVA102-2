import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Daire daire = new Daire();
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz : ");
        daire.r = input.nextInt();

        System.out.println(daire.r);

        System.out.println("Dairenin alanı : " + daire.alanHesapla());
        System.out.println("Dairenin çevresi : " + daire.cevreHesapla());

        System.out.println();

        Daire daire2 = new Daire();
        System.out.print("Lütfen dairenin yarıçapını giriniz : ");
        daire2.r = input.nextInt();

        System.out.println(daire2.r);

        System.out.println("Dairenin alanı : " + daire2.alanHesapla());
        System.out.println("Dairenin çevresi : " + daire2.cevreHesapla());

        System.out.println();

        Daire daire3 = null;
        System.out.print("Lütfen dairenin yarıçapını giriniz : ");
        daire3.r = input.nextInt();

        System.out.println(daire3.r);

        System.out.println("Dairenin alanı : " + daire3.alanHesapla());
        System.out.println("Dairenin çevresi : " + daire3.cevreHesapla());

    }
}
