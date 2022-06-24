package dev.patika.oop.inheritance1;

import java.util.Objects;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // constructor chain
        this.height = height;
    }

    public Cylinder(double radius,  double height, String color) {
        super(radius, color); // initialize superclass constructor
        this.height = height;
    }
    @Override
    public double getArea() {
        // total surface area of cylinder = 2πr(r + h)
        return (2 * super.getArea()) + (2 * Math.PI * this.getRadius() * this.height);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
