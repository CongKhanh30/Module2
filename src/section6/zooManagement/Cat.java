package section6.zooManagement;

public class Cat extends Animal {
    private String eyesColor;
    private boolean healthStatus;
    private String type;

    public Cat(String name, int birth, String eyesColor, boolean healthStatus, String type) {
        super(name, birth);
        this.eyesColor = eyesColor;
        this.healthStatus = healthStatus;
        this.type = type;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public boolean getStatus() {
        return healthStatus;
    }

    public void setStatus(boolean healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void healing(String heal) {
        System.out.println("Mèo được uống "  + heal);
    }

    public void healing(String heal, int amount) {
        System.out.println("Mèo được uống " + heal + amount + " viên");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                " eyesColor='" + this.eyesColor + '\'' +
                ", status=" + this.healthStatus +
                ", type='" + this.type + '\'' +
                '}';
    }
}