package dev.patika.oop.inheritance1;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Black");
        System.out.println(circle.getColor() +
                " circle area is " + new DecimalFormat("##.##").format(circle.getArea()));

        Cylinder cylinder = new Cylinder(10, 10, "black");
        System.out.println(cylinder.getArea());
    }
}
