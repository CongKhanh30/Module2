package Section6.zooManagement;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Cat cat = new Cat("Tom", 2001, "Đỏ", false, "Anh lông dài");
        Cat cat1 = new Cat("Jame", 2004, "Xanh", true, "Golden");
        Dog dog = new Dog("Jerry", 2000, "Đen", "Corgi");
        Dog dog1 = new Dog("Mono", 2002, "Vàng", "Pitbull");
        Bird bird = new Bird("Tiki", 2011,"Long", "Parrot", true);
        manage.addAnimal(cat);
        manage.addAnimal(cat1);
        manage.addAnimal(dog);
        manage.addAnimal(dog1);
        manage.addAnimal(bird);
//        manage.showAnimals();

//        manage.deleteAnimal(2);
//        manage.showAnimals();
//        manage.findAnimal(2);
        manage.editAnimal(2, "Rick", 2005);
        manage.showAnimals();


    }
}
