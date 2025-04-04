package models;

/**
 * The type Product.
 */
abstract class Product {
    private final String name;
    private final int price;
    private int quantity;

    /**
     * Instantiates a new Product.
     *
     * @param name     the name
     * @param price    the price
     * @param quantity the quantity
     */
    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Is expired boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isExpired();

    /**
     * Reduce quantity.
     *
     * @param quantity the quantity
     */
    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }
}
