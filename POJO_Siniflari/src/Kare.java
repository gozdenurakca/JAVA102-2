public class Kare {
    private int x;
    private int y;
    private int uzunluk;

    public void setX(int x) {
        if(x >= 0) {
            this.x = x;
        } else {
            System.out.println("X, -1'den büyük olmalıdır.");
        }
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        if(y >= 0) {
            this.y = y;
        } else {
            System.out.println("Y, -1'den büyük olmalıdır.");
        }
    }
    public int getY() {
        return y;
    }
    public void setUzunluk(int uzunluk) {
        if(uzunluk >= 0) {
            this.uzunluk = uzunluk;
        } else {
            System.out.println("Uzunluk, -1'den büyük olmalıdır.");
        }
    }
    public int getUzunluk() {
        return uzunluk;
    }

    public void ekranaBastir() {
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println("Uzunluk : " + uzunluk);
    }

}
