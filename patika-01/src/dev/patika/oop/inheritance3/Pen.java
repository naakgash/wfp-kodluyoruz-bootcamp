package dev.patika.oop.inheritance3;

import dev.patika.oop.inheritance2.Rectangle;

public class Pen {
    public void draw(Rectangle rectangle) {
        System.out.printf("%s circle area is %.2f\n",rectangle.getColor(), rectangle.getArea());
    }

    public void draw(Circle circle) {
        System.out.printf("%s circle area is %.2f\n",circle.getColor(), circle.getArea());
    }

    public void changeColor(String color, Rectangle rectangle) {
        rectangle.setColor(color);
    }

    public void changeColor(String color, Circle circle) {
        circle.setColor(color);
    }
}
