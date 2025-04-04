package models;

/**
 * The type Perishable product.
 */
public class PerishableProduct extends Product {
    /**
     * The Expired.
     */
    Boolean expired;

    /**
     * Instantiates a new Perishable product.
     *
     * @param name     the name
     * @param price    the price
     * @param quantity the quantity
     * @param expired  the expired
     */
    public PerishableProduct(String name, int price, int quantity, Boolean expired) {
        super(name, price, quantity);
        this.expired = expired;
    }

    @Override
    public Boolean isExpired() {
        return expired;
    }
}
