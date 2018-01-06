package car.analizer.seasons;

import org.junit.jupiter.api.Test;

class EnumSingletonTest {

    @Test
    void checkIfEnumSingletonCanInvokedOnce() {
        EnumSingleton firstCall = EnumSingleton.ONCE;
        //Second call is never printed
        EnumSingleton secondCall = EnumSingleton.ONCE;
    }
}