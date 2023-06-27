package practice2.studentManagement;

public class Student {
    private int id;
    private String fullName;
    private int age;
    private String homeTown;

    public Student(int id, String fullName, int age, String homeTown) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return homeTown;
    }

    public void setHometown(String hometown) {
        this.homeTown = homeTown;
    }

    public void showInformation() {
        System.out.println("ID học sinh: " + this.id);
        System.out.println("Họ và tên: " + this.fullName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Quê quán: " + this.homeTown);
    }
    @Override
    public String toString() {
        return "Học sinh " +
                "id: " + this.id +
                ", tên: '" + this.fullName + '\'' +
                ", tuổi: " + this.age +
                ", quê quán: '" + this.homeTown;
    }
}
