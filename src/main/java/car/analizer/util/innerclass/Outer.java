package car.analizer.util.innerclass;

public class Outer {
    private final String GREETING = "Greeting";

    protected class Inner {
        String print() {
            return GREETING;
        }
    }

    public String callInner() {
        Inner inner = new Inner();
        return inner.print();
    }
}
