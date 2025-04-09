package abstract_factory;

public class PartA implements Part {
    private final String name;
    public PartA(String name) {
        this.name = name;
    }

    @Override
    public void displayName() {
        System.out.println(this.name);
    }
}
