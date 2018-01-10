package car.analizer.ocean.client;

import car.analizer.mockito.MockitoExtension;
import car.analizer.ocean.service.LivesInOcean;
import car.analizer.ocean.sound.SoundType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OceanographerTest {
    @Mock
    private LivesInOcean dolphin;
    @Mock
    private LivesInOcean whale;

    @InjectMocks
    private Oceanographer oceanographer;

    @Test
    void shouldReturnCorrectSoundForConcreteOceanAnimal() {

        when(oceanographer.checkSound(dolphin)).thenReturn(SoundType.WHISTLE);
        when(oceanographer.checkSound(whale)).thenReturn(SoundType.SING);

        assertThat(SoundType.WHISTLE).isEqualTo(oceanographer.checkSound(dolphin));
        assertThat(SoundType.SING).isEqualTo(oceanographer.checkSound(whale));
    }
}