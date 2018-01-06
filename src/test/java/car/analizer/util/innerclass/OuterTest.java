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

    @Test
    void checkIfInstanceIsInner() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Assertions.assertEquals(true, inner instanceof Outer.Inner);
    }

    @Test
    void checkIfGreetingIsCalledInsideInnerClass() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Assertions.assertEquals(GREETING, inner.print());
    }
}