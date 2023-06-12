package Section6.Exercise2;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.5);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        cylinder.setRadius(3);
        cylinder.setColor("green");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
