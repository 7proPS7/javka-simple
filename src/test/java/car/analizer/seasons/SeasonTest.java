package car.analizer.seasons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeasonTest {

    @Test
    void checkIfExpectedVisitorsPriorityIsCorrect() {
        Assertions.assertEquals("Low", Season.WINTER.printExpectedVisitors());
        Assertions.assertEquals("Medium", Season.SPRING.printExpectedVisitors());
        Assertions.assertEquals("High", Season.SUMMER.printExpectedVisitors());
        Assertions.assertEquals("Medium", Season.AUTUMN.printExpectedVisitors());
    }
}