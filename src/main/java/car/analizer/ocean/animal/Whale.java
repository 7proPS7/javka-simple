package car.analizer.ocean.animal;

import car.analizer.ocean.service.LivesInOcean;
import car.analizer.ocean.sound.SoundType;

public class Whale implements LivesInOcean {
    public SoundType makeSound() {
        return SoundType.SING;
    }
}
