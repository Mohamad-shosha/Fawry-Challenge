package models;

import customer.Customer;
import utils.ShippingService;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Checkout service.
 */
public class CheckoutService {
    /**
     * Checkout.
     *
     * @param customer the customer
     * @param cart     the cart
     */
    public static void checkout(Customer customer, Cart cart) {
        if (cart.getItems().isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }

        double subtotal = 0;
        List<ShippableProduct> shippableItems = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            if (item.product.isExpired()) {
                throw new IllegalStateException(item.product.getName() + " is expired!");
            }
            subtotal += item.product.getPrice() * item.quantity;
            item.product.reduceQuantity(item.quantity);
            if (item.product instanceof ShippableProduct) {
                shippableItems.add((ShippableProduct) item.product);
            }
        }

        double shippingFees = ShippingService.calculateShippingFees(shippableItems);
        double totalAmount = subtotal + shippingFees;

        if (customer.getBalance() < totalAmount) {
            throw new IllegalStateException("Insufficient balance");
        }

        customer.deductBalance(totalAmount);

        System.out.println("\n** Checkout Receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + " \t " + (item.product.getPrice() * item.quantity));
        }
        System.out.println("Subtotal: \t " + subtotal);
        System.out.println("Shipping: \t " + shippingFees);
        System.out.println("Total: \t " + totalAmount);
        System.out.println("Remaining Balance: " + customer.getBalance());
    }
}
