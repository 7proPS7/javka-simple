package car.analizer.util.innerclass.privinterface;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleOfPrivInterfaceTest {

    @Test
    void checkIfPrivInterfaceInsiedClassIsImplementCorrect() {
        ExampleOfPrivInterface exampleOfPrivInterface = new ExampleOfPrivInterface();
        ExampleOfPrivInterface.DontTell dontTell = exampleOfPrivInterface.new DontTell();

        assertThat("LIVE").isEqualTo(dontTell.live());
    }
}