package dev.patika.questions;

public class AnimalFarm {
    public static void main(String[] args) {
        final String horse = "Length: 10";
        final String cat = "Length: " + horse.length();
        System.out.println("Animals are equal: " + horse == cat); // false
        System.out.println("Animals are equal: " + (horse == cat)); // Animals are equal: false

        String first = "Baeldung";
        String second = "Baeldung";
        System.out.println(first == second); // True

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        System.out.println(third == fourth); // False

        String fifth = "Baeldung";
        String sixth = new String("Baeldung");
        System.out.println(fifth == sixth); // False

        sixth = sixth.intern();
        System.out.println(fifth == sixth); // True
    }
}