package section7.Exercise1.test;

import section7.Exercise1.animal.Animal;
import section7.Exercise1.animal.Chicken;
import section7.Exercise1.animal.Tiger;
import section7.Exercise1.edible.Edible;

import section7.Exercise1.fruit.Fruit;
import section7.Exercise1.fruit.Apple;
import section7.Exercise1.fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}