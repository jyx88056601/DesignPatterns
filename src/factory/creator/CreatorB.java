package factory.creator;

import factory.product.Product;
import factory.product.ProductB;

public class CreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
