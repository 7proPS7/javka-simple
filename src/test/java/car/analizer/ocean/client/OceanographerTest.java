package car.analizer.ocean.client;

import car.analizer.ocean.animal.Dolphin;
import car.analizer.ocean.animal.Whale;
import car.analizer.ocean.sound.SoundType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OceanographerTest {

    @Test
    void shouldReturnCorrectSoundForConcreteOceanAnimal() {
        Oceanographer oceanographer = new Oceanographer();
        assertThat(SoundType.WHISTLE).isEqualTo(oceanographer.checkSound(new Dolphin()));
        assertThat(SoundType.SING).isEqualTo(oceanographer.checkSound(new Whale()));
    }
}