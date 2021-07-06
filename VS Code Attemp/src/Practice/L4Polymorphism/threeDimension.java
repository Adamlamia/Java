package Practice.L4Polymorphism;

public class threeDimension extends Shape {
    public void calArea(){

    }

    public void calVolume(){

    }

    public threeDimension() {
    }
}

/**
 * Cube
 */
class Cube extends threeDimension {
    public double calArea(double side) {
        double area = 6 * side * side;
        return area;
    }

    public double calVolume(double side) {
        double volume = side * side * side;
        return volume;
    }

    public Cube() {
    }
    
} 

/**
 * Sphere
 */
class Sphere extends threeDimension {
    private final double PI = 3.14159;

    public double calArea(double radius) {
        double area = 4 * PI * radius * radius;
        return area;
    }

    public double calVolume(double radius) {
        double volume = 4 / 3 * PI * radius * radius * radius;
        return volume;
    }

    public Sphere() {
    }
    
}