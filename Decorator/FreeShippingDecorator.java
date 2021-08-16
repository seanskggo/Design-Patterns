package programmingexample6;

public class FreeShippingDecorator extends Product {

    private int weight;
    private Product product;
    private double price;

    public FreeShippingDecorator(Product p1, double price, int weight) {
        this.price = price;
        this.product = p1;
        this.weight = weight;
    }

    @Override
    public double getShippingCost() {
        if (product.getPrice() > price && product.getWeight() < weight) return 0;
        return super.getShippingCost();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public int getWeight() {
        return product.getWeight();
    }

}
