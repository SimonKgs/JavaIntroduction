public class ProductData {
    public static void main(String[] args) {
        String productName = "Tomatoes";
        float price = 12.1F;
        int quantity = 10;
        boolean isOnSale = true;

        System.out.printf("Product: %s\n" +
                "Price: %.2f€\n" +
                "Quantity: %d\n" +
                "Available: %b\n\n", productName, price, quantity, isOnSale);

        productName = "Cherries";
        price = 17.35F;
        quantity = 0;
        isOnSale = false;

        System.out.printf("Product: %s\n" +
                "Price: %.2f€\n" +
                "Quantity: %d\n" +
                "Available: %b\n\n", productName, price, quantity, isOnSale);
    }
}
