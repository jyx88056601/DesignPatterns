package prototype;

public class A implements PrototypeOfClassAAndB {
    private int a;

    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public PrototypeOfClassAAndB copy() {
        return new A(a);
    }
}
