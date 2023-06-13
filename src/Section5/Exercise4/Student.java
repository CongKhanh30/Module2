package Section5.Exercise4;

public class Student {
    private String name = "John", classes = "C02";

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", classes='" + this.classes + '\'' +
                '}';
    }
}