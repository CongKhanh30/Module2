package Section6.zooManagement;

public class Bird extends Animal{
    private String beak;
    private String type;
    private boolean canFly;

    public Bird(String name, int birth, String beak, String type, boolean canFly) {
        super(name, birth);
        this.beak = beak;
        this.type = type;
        this.canFly = canFly;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chíp chíp");
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() +
                " beak='" + this.beak + '\'' +
                ", type='" + this.type + '\'' +
                ", canFly=" + this.canFly +
                '}';
    }
}