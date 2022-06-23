package dev.patika.basicconcepts;

public class B_StringConcatenateTest {
    public static void main(String[] args) {
        System.out.println("Hello " + 20 + 22); // Hello 2022
        System.out.println("Hello " + String.valueOf(20) + String.valueOf(22)); // Hello 2022
        // Java is a type-safe language so, a data types operate only with self data types.
        System.out.println("Hello " + (20 + 22)); // Hello 42
        // There is 8 primitive data-types in java.
        // byte(8-bits), short(16-bits), int(32-bits), long(64-bits)
        // float(32-bits), double(64-bits), char(16-bits), boolean(1-bit)
        // Each primitive type has the Wrapper Class that contains Utility Methods for each.
        // Wrapper Class -> int:Integer, char:Character, byte:Byte, short:Short
        // Wrapper classes have 'valueOf Method' each primitive data types.
        System.out.println(20 + 22 + "Hello " + 20 + 22); // 42Hello 2022
        // .java is compiled and extracted bytecode, then,
        // the bytecode is read up-to-down and left-to-right by JRE(Java Runtime Environment).
        // Since it reads from left to right,
        // it evaluates the values it sees before the String operation as int, so,
        // result is "42Hello 2022".
    }
}
