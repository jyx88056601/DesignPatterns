package abstract_factory;

public class ConcreteProductFactoryB  implements ProductFactory {
    @Override
    public PartA createPartA() {
       return new PartA("part A for Product B");
    }

    @Override
    public PartB createPartB() {
        return new PartB("part B for Product B");
    }
}
