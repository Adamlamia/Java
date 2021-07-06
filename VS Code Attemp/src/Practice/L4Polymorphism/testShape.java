package Practice.L4Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class testShape {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //Circle circle1 = new Circle();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        
        circle.calArea(10);
        triangle.calArea(10, 10);
        square.calArea(10);

        Cube cube = new Cube();
        Sphere sphere = new Sphere();

        cube.calArea(10);
        cube.calVolume(10);
        sphere.calArea(10);
        sphere.calVolume(10);

        list.add(circle);
        list.add(triangle);
        list.add(square);
        list.add(cube);
        list.add(sphere);
    
    }

    @Override
    public String toString() {
        return "testShape []";
    }

    
}
