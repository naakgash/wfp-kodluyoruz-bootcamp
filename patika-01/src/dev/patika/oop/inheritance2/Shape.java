package dev.patika.oop.inheritance2;

import java.util.Objects;

// 1-fields 2-constructors 3-methods 4-getter&setter 5-equals&hashCode&toString
public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color){
        this.color = color;
    }

    public double getArea() {
        System.out.println("There is no defined shape to calculate area...");
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
