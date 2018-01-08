package car.analizer.ocean.client;

import car.analizer.ocean.animal.Dolphin;
import car.analizer.ocean.animal.Whale;
import car.analizer.ocean.sound.SoundType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OceanographerTest {

    @Test
    void shouldReturnCorrectSoundForConcreteOceanAnimal() {
        Oceanographer oceanographer = new Oceanographer();
        Assertions.assertEquals(SoundType.WHISTLE, oceanographer.checkSound(new Dolphin()));
        Assertions.assertEquals(SoundType.SING, oceanographer.checkSound(new Whale()));
    }
}