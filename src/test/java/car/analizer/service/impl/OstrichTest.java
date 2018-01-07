package car.analizer.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OstrichTest {
    @Test
    void checkOstrichStepSize() throws Exception {
        Ostrich ostrich = new Ostrich();
        Assertions.assertEquals(50, ostrich.getStepSize());
    }

    @Test
    void checkHowOstrichIsStopped() {
        Ostrich ostrich = new Ostrich();
        Assertions.assertEquals("Ostrich is stopping slow", ostrich.stop());
    }
}