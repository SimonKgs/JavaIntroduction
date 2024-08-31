public class DataTypes {
    public static void main(String[] args) {
        // Data Types
        // Entire Type
        byte maxByteValue = 127;
        System.out.println("maxByteValue = " + maxByteValue);
        short maxShortValue = 32767;
        System.out.println("shortType = " + maxShortValue);
        int typeInt = 2123123123;
        System.out.println("typeInt (max 32 bits) = " + typeInt);
        long longType = 938238423942234234L;  // ends with L
        System.out.println("longType (max 64 bits) = " + longType);

        // Float point (default value 0.0)
        float floatType = 3.14F; // ends with F
        System.out.println("floatType = " + floatType);
        double doubleType = 3.12323D; // In this case D optional because it is the default for floats
        System.out.println("doubleType = " + doubleType);

        // Boolean default value false
        boolean test = false;
        System.out.println("test = " + test);
        // String ( default value null )
        String test2 = null;
        System.out.println("test2 = " + test2);

        // var will infer the type to the variable
        // it must have an initial value
        // after the initialization the type of the variable cannot change
        var stringVariable = "This is a string";
        System.out.println("stringVariable = " + stringVariable);
        var intVariable = 12;
        System.out.println("intVariable = " + intVariable);
        var floatVariable = 12.12F;
        System.out.println("floatVariable = " + floatVariable);

        // concatenate
        // if concatenate a number with a string the result will be a string
        String twoVariables = stringVariable + " " + intVariable + " " + floatVariable;
        System.out.println("\n\ntwoVariables = " + twoVariables);

        // constants
        // Is a value that won't change on the program
        // it is normally uppercase and separated with and underscore if more than one word
        // CONSTANT_VARIABLE
        final float PI = 3.14F;
        // py = 12.2; it cannot be changed
        System.out.println("PI = " + PI);
        
    }
}
