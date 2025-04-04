package models;

/**
 * The type Shippable product.
 */
public class ShippableProduct extends Product implements Shippable {
    private final double weight;

    /**
     * Instantiates a new Shippable product.
     *
     * @param name     the name
     * @param price    the price
     * @param quantity the quantity
     * @param weight   the weight
     */
    public ShippableProduct(String name, int price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public Boolean isExpired() {
        return false;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
