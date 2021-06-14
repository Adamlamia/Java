package Geometric;

public class Circle extends GeometricObject {
    private double radius;
    private final double PAI = 3.142;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, Boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return PAI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * PAI * radius;
    }


}
