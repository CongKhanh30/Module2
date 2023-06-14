package section4.practiceStatic;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(5);
        Circle circle4 = new Circle(4.5);
        Circle circle5 = new Circle(3.5);
        System.out.println("Number of Objects: " + Circle.idOfObjects());

        System.out.println(circle1);
        double area1 = circle1.getArea();
        double perimeter1 = circle1.getPerimeter();
        System.out.println("Area 1: " + area1 + " , Perimeter 1: " + perimeter1);

        System.out.println(circle2);
        double area2 = circle2.getArea();
        double perimeter2 = circle2.getPerimeter();
        System.out.println("Area 2: " + area2 + " , Perimeter 2: " + perimeter2);

        System.out.println(circle3);
        double area3 = circle3.getArea();
        double perimeter3 = circle3.getPerimeter();
        System.out.println("Area 3: " + area3 + " , Perimeter 3: " + perimeter3);

        System.out.println(circle4);
        double area4 = circle4.getArea();
        double perimeter4 = circle1.getPerimeter();
        System.out.println("Area 4: " + area4 + " , Perimeter 4: " + perimeter4);

        System.out.println(circle5);
        double area5 = circle5.getArea();
        double perimeter5 = circle5.getPerimeter();
        System.out.println("Area 5: " + area5 + " , Perimeter 5: " + perimeter5);

        System.out.println("Max Radius: " + Circle.getMaxRadius());
        System.out.println("Total Circle Area: " + Circle.getTotalArea());


    }
}
