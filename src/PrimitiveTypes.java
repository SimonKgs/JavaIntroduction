public class PrimitiveTypes {
    public static void main(String[] args) {
        // numeric variables
        // its difference is the quantity of numbers it can store
        byte n1 = 1;
        short n2 = 1;
        int n3 = 1;
        long n4 = 1;

        System.out.printf("n1: %d\n", n1);
        System.out.printf("n2: %d\n", n2);
        System.out.printf("n3: %d\n", n3);
        System.out.printf("n4: %d\n", n4);

        // Floating points
        // to declare a float it must end with f
        // float to smaller 32bits
        // double bigger ones 64bits
        float f1 = 3.1F;
        double f2 = 3.F;

        System.out.printf("f1: %f\n", f1);
        System.out.printf("f2: %f\n", f2);

        // Characters
        // single 16bit Unicode chars
        char letter = 'a';
        char unicodeChar = '\u03A9';
        char asciiChar = 65;

        System.out.printf("letter: %c\n", letter);
        System.out.printf("unicodeChar: %c\n", unicodeChar);
        System.out.printf("asciiChar: %c\n", asciiChar);

        // Boolean
        // true or false
        boolean isTrue = false;
        System.out.printf("Boolean: %b\n", isTrue);


    }
}
