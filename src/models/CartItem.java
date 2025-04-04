package models;

/**
 * The type Cart item.
 */
public class CartItem {
    Product product;
    int quantity;
    /**
     * Instantiates a new Cart item.
     *
     * @param product  the product
     * @param quantity the quantity
     */
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
