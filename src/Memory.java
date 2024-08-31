public class Memory {
    public static void main(String[] args) {
        // the variables in java are stored in RAM memory
        // it is volatile and is used to store temporally the values of the variables
        // the values stored here are deleted when the program finish

        // In Java there are two classifications for the RAM memory
        // Stack: Store primitive variables that are declared inside a method, local variables and
        // references to objects

        // This variables will be stored on the stack
        // it has an address on memory in hexadecimal like 0x333
        // so the name of the variable is the address but simplified
        int age = 29;
        boolean isMarried = true;

        // when a modification happens its modification happens directly on the stack
        // accessing to the address of the variable and changes its value
        age = 32;


        // Heap: It stores objects and their data.

        // First, the object is created in heap memory
        // and the reference to this object is stored on the stack.
        String name = "Juan";

        // When you reassign the variable to a new value,
        // a new object is created in heap memory for the new value.
        // The stack variable is updated to point to this new object.
        // The reference on the stack is updated, and the variable now points to the new object on the heap.
        name = "Carlos";

        // After the change, the first object "Juan" becomes eligible for garbage collection.
        // From that moment, it is awaiting garbage collection to be deleted.
        System.out.printf("%d, %b, %s",age, isMarried, name);
    }
}
