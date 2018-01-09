package car.analizer.seasons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeasonTest {

    @Test
    void checkIfExpectedVisitorsPriorityIsCorrect() {
        assertThat("Low").isEqualTo(Season.WINTER.printExpectedVisitors());
        assertThat("Medium").isEqualTo(Season.SPRING.printExpectedVisitors());
        assertThat("High").isEqualTo(Season.SUMMER.printExpectedVisitors());
        assertThat("Medium").isEqualTo(Season.AUTUMN.printExpectedVisitors());
    }
}