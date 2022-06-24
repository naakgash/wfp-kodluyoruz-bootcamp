package dev.patika.oop.polymorphism;

// 1-fields 2-constructors 3-methods 4-getter&setter 5-equals&hashCode&toString
public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color){
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
