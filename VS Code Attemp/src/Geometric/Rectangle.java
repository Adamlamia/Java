package Geometric;

public class Rectangle extends GeometricObject {
    private Double width, height;

    public Rectangle(){
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Double width, Double height, String Colour, Boolean Filled) {
        super(Colour, Filled);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*height;
    }
    
    
}
