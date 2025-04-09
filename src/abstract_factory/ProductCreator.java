package abstract_factory;

public class ProductCreator {
    public void createProduct(ProductFactory productFactory) {
      productFactory.createPartA().displayName();
      productFactory.createPartB().displayName();
    }
}
