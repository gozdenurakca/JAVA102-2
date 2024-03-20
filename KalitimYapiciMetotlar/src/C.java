public class C extends B {
    public C(String text) {
        // super çağrışımı constructordan sonra gelen ilk satırda yapılmalıdır !
        super(text);
        System.out.println("C ctor");

    }
}
