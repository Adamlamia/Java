package Practice.L4Polymorphism;

public class twoDimension extends Shape {
    
    public twoDimension() {

    }

    public void calArea() {

    }

}

/**
 * Circle
 */
class Circle extends twoDimension {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle() {
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calArea(double radius) {
        double area = PI * radius * radius;
        return area;
    }
}

/**
 * Triangle
 */
class Triangle extends twoDimension {
    public double height, length;

    public Triangle() {
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public double calArea(double height, double length) {
        double area = (height * length) / 2;
        return area;
    }
}

/**
 * Square
 */
class Square extends twoDimension {
    private double height;

    public Square() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calArea(double height) {
        double area = height * height;
        return area;
    }
}