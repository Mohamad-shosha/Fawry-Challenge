import models.Cart;
import models.CheckoutService;
import models.PerishableProduct;
import models.ShippableProduct;
import customer.Customer;

public class Main {
    public static void main(String[] args) {
        PerishableProduct cheese = new PerishableProduct("Cheese", 100, 5, false);
        PerishableProduct biscuits = new PerishableProduct("Biscuits", 150, 3, false);
        ShippableProduct tv = new ShippableProduct("TV", 5000, 2, 7.5);

        Customer customer = new Customer("Mohamed", 6000);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(tv, 1);

        CheckoutService.checkout(customer, cart);
    }
}