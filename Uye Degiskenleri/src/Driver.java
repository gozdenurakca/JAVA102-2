import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();
        Scanner input = new Scanner(System.in);
        System.out.print("Bisikletinizin sahip olduğu vites sayısı kaçtır ? ");
        bisiklet.vites = input.nextInt();
        System.out.print("Bisikletinizin hızı kaçtır ? ");
        bisiklet.hiz = input.nextInt();
        Bisiklet.bisikletSayisi = 1;
        bisiklet.bilgileriYazdir();

        Bisiklet bisiklet2 = new Bisiklet();
        System.out.print("Bisikletinizin sahip olduğu vites sayısı kaçtır ? ");
        bisiklet2.vites = input.nextInt();
        System.out.print("Bisikletinizin hızı kaçtır ? ");
        bisiklet2.hiz = input.nextInt();
        Bisiklet.bisikletSayisi = 2;
        bisiklet2.bilgileriYazdir();
    }
}
