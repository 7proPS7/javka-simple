package car.analizer.util.innerclass.privinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleOfPrivInterfaceTest {

    @Test
    void checkIfPrivInterfaceInsiedClassIsImplementCorrect() {
        ExampleOfPrivInterface exampleOfPrivInterface = new ExampleOfPrivInterface();
        ExampleOfPrivInterface.DontTell dontTell = exampleOfPrivInterface.new DontTell();

        Assertions.assertEquals("LIVE", dontTell.live());
    }
}