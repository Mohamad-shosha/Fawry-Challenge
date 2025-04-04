package customer;

/**
 * The type Customer.
 */
public class Customer {
    private final String name;
    private double balance;

    /**
     * Instantiates a new Customer.
     *
     * @param name    the name
     * @param balance the balance
     */
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deduct balance.
     *
     * @param amount the amount
     */
    public void deductBalance(double amount) {
        this.balance -= amount;
    }
}
