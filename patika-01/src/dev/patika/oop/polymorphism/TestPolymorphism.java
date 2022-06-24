package dev.patika.oop.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle("Blue", 12);
        //System.out.printf("%s circle area is %.2f\n",circle.getColor(), circle.getArea());

        Rectangle rectangle = new Rectangle("Red", 15, 8);
        //System.out.printf("%s rectangle area is %.2f",rectangle.getColor(), rectangle.getArea());

        Pen pen = new Pen();
        // Shape shape = new Shape(); // 'Shape' is abstract; cannot be instantiated

        if(circle instanceof Circle) {
            pen.draw((Circle) circle);
            pen.changeColor("Yellow", (Circle) circle);
            pen.draw(circle);
        }

        if(rectangle instanceof Rectangle) {
            pen.draw((Rectangle) rectangle);
            pen.changeColor("White", (Rectangle) rectangle);
            pen.draw(rectangle);
        }
    }
}
