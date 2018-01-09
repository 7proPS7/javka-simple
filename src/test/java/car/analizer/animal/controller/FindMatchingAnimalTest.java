package car.analizer.animal.controller;

import car.analizer.animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

class FindMatchingAnimalTest {

    @Test
    void checkIfAnimalCanDoSth() {
        Animal tiger = new Animal("TIGER", true, false);
        assertThat(tiger.toString()).isEqualTo(FindMatchingAnimal.print(tiger, (Predicate<Animal>) Animal::canHop));

        Animal frog = new Animal("FROG", true, true);
        assertThat(frog.toString()).isEqualTo(FindMatchingAnimal.print(frog, (Predicate<Animal>) Animal::canHop));
        assertThat(frog.toString()).isEqualTo(FindMatchingAnimal.print(frog, (Predicate<Animal>) Animal::canSwim));
    }

    @Test
    void shouldReturnNoneIfAnimalOfNotSkillsExpected() {
        Animal fakeAnimal = new Animal("FAKE_ANIMAL", false, false);
        assertThat("NONE").isEqualTo(FindMatchingAnimal.print(fakeAnimal, (Predicate<Animal>) Animal::canHop));
    }
}