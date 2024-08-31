public class HotelReservation {
    public static void main(String[] args) {
        String clientName = "Pepe";
        int days = 8;
        boolean hasSeaViews = true;
        final float PRICE_PER_DAY = 20.0F;

        System.out.printf("" +
                "Client: %s\n" +
                "Days: %d\n" +
                "Views: %b\n" +
                "Total price: %.2f €\n\n", clientName, days, hasSeaViews, (PRICE_PER_DAY * days));

        clientName = "Luis";
        days = 2;
        hasSeaViews = true;

        System.out.printf("" +
                "Client: %s\n" +
                "Days: %d\n" +
                "Views: %b\n" +
                "Total price: %.2f €\n\n", clientName, days, hasSeaViews, (PRICE_PER_DAY * days));

    }
}
