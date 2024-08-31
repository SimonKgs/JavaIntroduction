public class VariableNames {
    public static void main(String[] args) {
        // Rules to name variables
        // Must start with a letter, $ symbol or underscore _
        // it cannot contain spaces or special characters
        // it cannot be a reserved word
        // it is case-sensitive, so name, Name and NAME are three different variables
        // by convention it uses camelCase
        // also make them descriptive

        int numberOne = 1;
        int _numberOne = 1;
        int $numberOne = 1;
        System.out.println("numberOne = " + numberOne);
        System.out.println("_numberOne = " + _numberOne);
        System.out.println("$numberOne = " + $numberOne);

    }
}
