package car.analizer.ocean.client;

import car.analizer.ocean.service.LivesInOcean;
import car.analizer.ocean.sound.SoundType;

public class Oceanographer {
    public SoundType checkSound(LivesInOcean animal) {
        return animal.makeSound();
    }
}
