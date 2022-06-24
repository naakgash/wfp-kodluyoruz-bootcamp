package dev.patika.oop.inheritance1;
//import java.lang.object;

import java.util.Objects;
// 1-fields 2-constructors 3-methods 4-getter&setter 5-equals&hashCode&toString
public class Circle extends Object {
    // instance variables (fields)
    private double radius;
    private String color;

    // constructors
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // custom methods
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // equals & hashCode & toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
