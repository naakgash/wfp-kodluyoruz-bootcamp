package dev.patika.basicconcepts;

public class D_PrimitiveValueCopyTest {
    public static void main(String[] args) {
        // Java is always pass-by-value.
        // Java is not pass-by-reference.
        // The reason that our intuition as a pass-by-reference is Java's Stack-Heap structure.
        int m = 12;
        int n = m;

        m++; // shorthand operator

        System.out.println(m); // 13
        System.out.println(n); // 12
    }
}
