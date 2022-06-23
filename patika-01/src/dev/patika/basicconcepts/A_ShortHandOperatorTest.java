package dev.patika.basicconcepts;

public class A_ShortHandOperatorTest {
    public static void main(String[] args) {
        // Because of primitive data types such as int, boolean, double, etc.
        // Java is not a fully object-oriented language.
        int x = 2;
        int y = x++; // x + 1; shorthand operator
        int z = x--; // x - 1; shorthand operator

        System.out.println(" x : " + x); // x : 2
        System.out.println(" y : " + y); // y : 2
        System.out.println(" z : " + z); // z : 3
        System.out.println(" x : " + x); // x : 2
    }
}
