package Geometric;

public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObject cA = new Circle(5.0, "Red", true);
        GeometricObject rA = new Rectangle(2.0, 5.0, "Blue", false);

        System.out.println(cA.getArea());
        System.out.println(cA.getPerimeter());
        System.out.println(cA.toString());

        System.out.println(rA.getArea());
        System.out.println(rA.getPerimeter());
        System.out.println(rA.toString());
    }
}
