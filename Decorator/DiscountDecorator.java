package programmingexample6;

public class DiscountDecorator extends Product{

    private Product product;
    private double discount;

    public DiscountDecorator(Product p1, double discount) {
        this.discount = discount;
        this.product = p1;
    }

    @Override
    public double getPrice() {
        return product.getPrice() * (100 - discount)/100;
    }

    @Override
    public int getWeight() {
        return product.getWeight();
    }

    @Override
    public double getShippingCost() {
        return product.getShippingCost();
    }

}
