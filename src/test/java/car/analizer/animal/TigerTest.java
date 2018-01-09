package car.analizer.animal;

import car.analizer.animal.response.SpeedType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TigerTest {

    @Test
    void checkSprintCorrectness() {
        Animal animal = new Animal("Tiger", false, false);
        Tiger tiger = new Tiger();
        assertThat(SpeedType.FAST.toString()).isEqualTo(tiger.sprint(animal));
    }
}