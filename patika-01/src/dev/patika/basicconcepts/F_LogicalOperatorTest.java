package dev.patika.basicconcepts;

public class F_LogicalOperatorTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        // (&&) conditional AND
        // If it occurred a short circuit statement, the compiler does not compile the other side.
        // (&) boolean logical AND
        // The compiler always compiles both side.
        if (false && (1 == ++x)) {
            System.out.println("Inside in if...");
        }

        System.out.println(x); // if &&, 0; if &, 1.

        // (||) conditional OR
        // If it occurred a short circuit statement, the compiler does not compile the other side.
        // (|) boolean logical OR
        // The compiler always compiles both side.
        if (true || (1 == ++y)) {
            System.out.println("Inside in if...");
        }

        System.out.println(y); // if || 0; if |, 1.
    }
}
