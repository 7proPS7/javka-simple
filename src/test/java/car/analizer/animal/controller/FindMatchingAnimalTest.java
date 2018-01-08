package car.analizer.animal.controller;

import car.analizer.animal.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMatchingAnimalTest {

    @Test
    void checkIfAnimalCanDoSth() {
        Animal tiger = new Animal("TIGER", true, false);
        Assertions.assertEquals(tiger.toString(), FindMatchingAnimal.print(tiger, Animal::canHop));

        Animal frog = new Animal("FROG", true, true);
        Assertions.assertEquals(frog.toString(), FindMatchingAnimal.print(frog, Animal::canHop));
        Assertions.assertEquals(frog.toString(), FindMatchingAnimal.print(frog, Animal::canSwim));
    }
}