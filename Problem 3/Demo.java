
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
        shapes[4] = new Circle(2.5);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}