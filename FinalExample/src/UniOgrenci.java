public class UniOgrenci extends  Ogrenci{
    public UniOgrenci(int numara) {
        super(numara);
    }
    public void yazdir() {
        System.out.println("Univ Öğrenci " + getNumara());
    }
}

