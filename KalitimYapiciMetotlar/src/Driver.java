public class Driver {
    public static void main(String[] args) {

        // A a = new A();
        // B b = new B(); // önce a ctor daha sonra b ctor çalışır, çünkü b, a'dan miras almış

        C c = new C("Text");
        // c sınıfının var olabilmesi için önce a nın daha sonra b nin en son c nin oluşması gerekiyor.
    }
}
