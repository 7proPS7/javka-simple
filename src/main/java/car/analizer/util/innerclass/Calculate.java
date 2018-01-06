package car.analizer.util.innerclass;

public class Calculate {
    private final int LENGTH = 5;

    public int calculate() {
        final int WIDTH = 20;

        class Multiplication {
            private int multiply() {
                return LENGTH * WIDTH;
            }
        }

        Multiplication multiplication = new Multiplication();
        return multiplication.multiply();
    }
}
