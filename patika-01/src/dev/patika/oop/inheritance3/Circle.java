package dev.patika.oop.inheritance3;
//import java.lang.object;

import java.util.Objects;

// 1-fields 2-constructors 3-methods 4-getter&setter 5-equals&hashCode&toString
public class Circle extends Shape {
    // instance variables (fields)
    private double radius;

    // constructors

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // custom methods
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // getter & setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // equals & hashCode & toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + '\'' +
                '}';
    }
}
