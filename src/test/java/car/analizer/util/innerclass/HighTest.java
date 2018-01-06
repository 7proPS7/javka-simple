package car.analizer.util.innerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HighTest {

    private final int HIGH = 30;
    private final int MEDIUM = 20;
    private final int LOW = 10;

    @Test
    void checkParameterValueInsideClass() {
        High high = new High();
        High.Medium medium = high.new Medium();
        High.Medium.Low low = medium.new Low();

        Assertions.assertEquals(HIGH, low.getHighValue());
        Assertions.assertEquals(MEDIUM, low.getMediumValue());
        Assertions.assertEquals(LOW, low.getLowValue());
        Assertions.assertEquals(LOW, low.getLowValueAndUseThis());
    }


}