package dev.patika.oop.inheritance2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 12);
        System.out.printf("%s circle area is %.2f\n",circle.getColor(), circle.getArea());

        Rectangle rectangle = new Rectangle("Red", 15, 8);
        System.out.printf("%s rectangle area is %.2f",rectangle.getColor(), rectangle.getArea());
    }
}
