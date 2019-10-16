public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI*2)*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius,2));
    }
}
