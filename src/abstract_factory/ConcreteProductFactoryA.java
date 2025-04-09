package abstract_factory;

public class ConcreteProductFactoryA implements ProductFactory {
    @Override
    public PartA createPartA() {
      return new PartA("part A for Product A");
    }

    @Override
    public PartB createPartB() {
        return new PartB("part B for Product A");
    }
}
