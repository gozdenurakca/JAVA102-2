public /*final*/ class Ogrenci {
    private final int numara;

    public Ogrenci(int numara) {
        this.numara = numara;
    }

    public int getNumara() {
        return numara;
    }
    /*public void setNumara(int numara) {
        this.numara = numara;
        // final olarak belirtildiği için değeri değişemez.
    }*/

    public /* final */  void yazdir() {
        System.out.println("Öğrencinin numarası : " + numara);
    }
}
