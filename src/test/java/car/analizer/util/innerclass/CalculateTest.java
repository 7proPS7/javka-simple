package car.analizer.util.innerclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculateTest {

    @Test
    void checkIfCalculateResultIsCorrect() {
        Calculate calculate = new Calculate();
        assertThat(100).isEqualTo(calculate.calculate());
    }
}