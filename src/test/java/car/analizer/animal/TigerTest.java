package car.analizer.animal;

import car.analizer.animal.response.SpeedType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TigerTest {

    @Test
    void checkSprintCorrectness() {
        Animal animal = new Animal("Tiger", false, false);
        Tiger tiger = new Tiger();
        Assertions.assertEquals(SpeedType.FAST.toString(), tiger.sprint(animal));
    }
}