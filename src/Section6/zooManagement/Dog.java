package Section6.zooManagement;

public class Dog extends Animal{
    private String color;
    private String type;
    Dog(String name, int birth, String color, String type) {
        super(name, birth);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("Go go");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                " color='" + this.color + '\'' +
                ", type='" + this.type + '\'' +
                '}';
    }
}