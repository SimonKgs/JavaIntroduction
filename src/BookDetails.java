public class BookDetails {
    public static void main(String[] args) {
        // Book Detail
        String title = "El señor de los anillos";
        int publicationYear = 1954;
        boolean isAvailable = true;
        double price = 500.50;

        System.out.printf("Title: %s\nYear: %d\nAvailable: %b\nPrice: %.2f\n\n", title, publicationYear, isAvailable, price);


        // Person details
        String name = "Simón";
        int age = 34;
        double height = 1.75;
        String country = "Spain";
        boolean isMarried = false;
        System.out.printf("name: %s\n" +
                "age: %d\n" +
                "Married: %b\n" +
                "Height: %.2f\n" +
                "Country: %s",
                name, age, isMarried, height, country);
    }
}
