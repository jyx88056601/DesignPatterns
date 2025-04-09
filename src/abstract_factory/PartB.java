package abstract_factory;

public class PartB implements Part {
    private final String name;

    public PartB(String name) {
        this.name = name;
    }
    @Override
    public void displayName() {
        System.out.println(this.name);
    }

}
