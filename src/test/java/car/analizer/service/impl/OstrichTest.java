package car.analizer.service.impl;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OstrichTest {
    @Test
    void checkOstrichStepSize() throws Exception {
        Ostrich ostrich = new Ostrich();
        assertThat(50).isEqualTo(ostrich.getStepSize());
    }

    @Test
    void checkHowOstrichIsStopped() {
        Ostrich ostrich = new Ostrich();
        assertThat("Ostrich is stopping slow").isEqualTo(ostrich.stop());
    }
}