package prototype;

public class B implements PrototypeOfClassAAndB {
    private int b;

    public B(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public PrototypeOfClassAAndB copy() {
         return new B(this.b);
    }
}
