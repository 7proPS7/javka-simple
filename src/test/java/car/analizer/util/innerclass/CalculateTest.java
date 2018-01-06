package car.analizer.util.innerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateTest {

    @Test
    void checkIfCalculateResultIsCorrect() {
        Calculate calculate = new Calculate();
        Assertions.assertEquals(100, calculate.calculate());
    }
}