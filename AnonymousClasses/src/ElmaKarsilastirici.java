import java.util.Comparator;

public class ElmaKarsilastirici implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Elma e1 = (Elma) o1;
        Elma e2 = (Elma) o2;
        return e1.getAgirlik() - e2.getAgirlik();
        // eğer o1 == o2 olursa return 0
        // o1>o2 olursa sonuç true
        // o1<o2 olursa sonuç false
    }
}
