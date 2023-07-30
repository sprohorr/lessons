package homework14.animal;

import static homework14.animal.model.Animals.*;

public class AnimalsRunner {
    public static void main(String[] args) {

        addLastAnimal("Horse");
        addLastAnimal("Cat");
        addLastAnimal("Pig");
        addLastAnimal("Wolf");
        addLastAnimal("Bear");
        printList(animal);
        removeFirstAnimal();
        printList(animal);
    }

}
