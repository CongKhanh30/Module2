package section7.Exercise1.animal;

import section7.Exercise1.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Chip chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
