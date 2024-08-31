import java.util.Arrays;

public class ReferenceTypes {
    public static void main(String[] args) {

        // Reference types refers to object classes
        // any instance of a class is a type

        // Strings
        // an object that represent a sequence of characters
        String greeting = "Hello world";
        System.out.printf("String %s\n", greeting);

        // Enum
        // to make a list of unique values
        enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
        Day today = Day.SATURDAY;
        System.out.printf("ENUM DAY: %s\n", today);

        // Array
        // this one stores a set of values of one type
        int[] numbers = {1, 2, 3, 4,5 };
        String[] words = {"apple", "banana", "cherry"};
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // different ways to print an array
        System.out.printf("Array: %s\n", Arrays.toString(numbers));
        System.out.printf("2D Array: %s\n", Arrays.deepToString(matrix));

        // looping through an array to print each different element
        for (int i = 0; i < words.length; i++) {
            System.out.printf("word %d: %s\n", i, words[i]);
        }
    }
}
