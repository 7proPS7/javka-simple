package car.analizer.ocean.animal;

import car.analizer.ocean.service.LivesInOcean;
import car.analizer.ocean.sound.SoundType;

public class Dolphin implements LivesInOcean {
    public SoundType makeSound() {
        return SoundType.WHISTLE;
    }
}
