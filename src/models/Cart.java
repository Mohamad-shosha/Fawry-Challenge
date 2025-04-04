package models;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Cart.
 */
public class Cart {
    private final List<CartItem> items = new ArrayList<>();

    /**
     *
     * @param product  the product
     * @param quantity the quantity
     */
    public void add(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough stock available for " + product.getName());
        } else if (product.isExpired()) {
            throw new IllegalStateException(product.getName() + " is expired!");
        }
        items.add(new CartItem(product, quantity));
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<CartItem> getItems() {
        return items;
    }
}
