abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.printf("Area = %.2f%n", shape.area());
    }
}
