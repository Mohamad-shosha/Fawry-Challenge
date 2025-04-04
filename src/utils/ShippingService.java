package utils;

import models.Shippable;
import models.ShippableProduct;

import java.util.List;

/**
 * The type Shipping service.
 */
public class ShippingService {
    /**
     * Calculate shipping fees double.
     *
     * @param shippableItems the shippable items
     * @return the double
     */
    public static double calculateShippingFees(List<ShippableProduct> shippableItems) {
        double totalWeight = shippableItems.stream().mapToDouble(Shippable::getWeight).sum();
        return totalWeight * 5; // Example: $10 per kg
    }
}
