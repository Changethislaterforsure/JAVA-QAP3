
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
        shapes[4] = new Circle(2.5);

        System.out.println("Before scaling:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        scaleAll(shapes, 2.0); // scale all shapes by factor of 2

        System.out.println("\nAfter scaling by factor of 2:");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    // Static method to scale all Scalable objects
    public static void scaleAll(Scalable[] items, double factor) {
        for (Scalable s : items) {
            s.scale(factor);
        }
    }
}