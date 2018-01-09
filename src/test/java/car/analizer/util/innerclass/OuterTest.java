package car.analizer.util.innerclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OuterTest {

    private final String GREETING = "Greeting";

    @Test
    void checkIfInnerIsCallFromOuter() {
        Outer outer = new Outer();
        assertThat(GREETING).isEqualTo(outer.callInner());
    }

    @Test
    void checkIfInstanceIsInner() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertThat(true).isEqualTo(inner instanceof Outer.Inner);
    }

    @Test
    void checkIfGreetingIsCalledInsideInnerClass() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertThat(GREETING).isEqualTo(inner.print());
    }
}