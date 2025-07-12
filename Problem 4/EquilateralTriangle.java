
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double sideLength) {
        super(sideLength, sideLength, sideLength);
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}