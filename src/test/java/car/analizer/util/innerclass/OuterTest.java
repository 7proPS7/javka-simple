package car.analizer.util.innerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OuterTest {

    private final String GREETING = "Greeting";

    @Test
    void checkIfInnerIsCallFromOuter() {
        Outer outer = new Outer();
        Assertions.assertEquals(GREETING, outer.callInner());
    }
}