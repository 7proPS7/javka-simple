package car.analizer.animal.service;

import car.analizer.animal.Animal;

@FunctionalInterface
public interface CheckTrait {
    boolean test(Animal a);
}
