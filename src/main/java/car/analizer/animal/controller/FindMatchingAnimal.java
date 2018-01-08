package car.analizer.animal.controller;

import car.analizer.animal.Animal;
import car.analizer.animal.service.CheckTrait;

import java.util.function.Predicate;

public class FindMatchingAnimal {

    public static String print(Animal animal, Predicate<Animal> trait) {
        return trait.test(animal) ? animal.toString() : "NONE";
    }

    @Deprecated
    public static String print(Animal animal, CheckTrait trait) {
        return trait.test(animal) ? animal.toString() : "NONE";
    }
}
