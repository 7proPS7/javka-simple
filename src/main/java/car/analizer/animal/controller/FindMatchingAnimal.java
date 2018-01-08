package car.analizer.animal.controller;

import car.analizer.animal.Animal;
import car.analizer.animal.service.CheckTrait;

public class FindMatchingAnimal {
    public static String print(Animal animal, CheckTrait trait) {
        return trait.test(animal) ? animal.toString() : "NONE";
    }
}
