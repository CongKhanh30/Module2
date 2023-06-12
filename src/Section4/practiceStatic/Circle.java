package Section4.practiceStatic;

public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int count = 0;
    public static double totalArea = 0;
    public static double maxRadius = 0;

    public Circle(double radius) {
        this.id = ++count;
        this.radius = radius;
        totalArea += getArea();
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }

    public static int idOfObjects() {
        return count;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + this.id +
                ", radius=" + this.radius +
                '}';
    }
}

