package factory.creator;

import factory.product.Product;

public abstract class Creator {

    private final Product product;

    public Creator() {
        this.product = createProduct();
    }

    public abstract Product createProduct();

    public void showProduct() {
        product.showName();
    }
}
