package car.analizer.util.innerclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HighTest {

    private final int HIGH = 30;
    private final int MEDIUM = 20;
    private final int LOW = 10;

    @Test
    void checkParameterValueInsideClass() {
        High high = new High();
        High.Medium medium = high.new Medium();
        High.Medium.Low low = medium.new Low();

        assertThat(HIGH).isEqualTo(low.getHighValue());
        assertThat(MEDIUM).isEqualTo(low.getMediumValue());
        assertThat(LOW).isEqualTo(low.getLowValue());
        assertThat(LOW).isEqualTo(low.getLowValueAndUseThis());
    }
}