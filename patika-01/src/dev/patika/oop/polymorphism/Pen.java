package dev.patika.oop.polymorphism;

public class Pen {
    public void draw(Shape shape) {
        if(shape instanceof Circle) {
            System.out.printf("%s circle area is %.2f\n",shape.getColor(), shape.getArea());
        }else if(shape instanceof Rectangle) {
            System.out.printf("%s circle area is %.2f\n",shape.getColor(), shape.getArea());
        }
    }
    public void changeColor(String color, Shape shape) {
        shape.setColor(color);
    }
}
