package car.analizer.animal.controller;

import car.analizer.animal.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class FindMatchingAnimalTest {

    @Test
    void checkIfAnimalCanDoSth() {
        Animal tiger = new Animal("TIGER", true, false);
        Assertions.assertEquals(tiger.toString(), FindMatchingAnimal.print(tiger, (Predicate<Animal>) Animal::canHop));

        Animal frog = new Animal("FROG", true, true);
        Assertions.assertEquals(frog.toString(), FindMatchingAnimal.print(frog, (Predicate<Animal>) Animal::canHop));
        Assertions.assertEquals(frog.toString(), FindMatchingAnimal.print(frog, (Predicate<Animal>) Animal::canSwim));
    }

    @Test
    void shouldReturnNoneIfAnimalOfNotSkillsExpected() {
        Animal fakeAnimal = new Animal("FAKE_ANIMAL", false, false);
        Assertions.assertEquals("NONE", FindMatchingAnimal.print(fakeAnimal, (Predicate<Animal>) Animal::canHop));
    }
}