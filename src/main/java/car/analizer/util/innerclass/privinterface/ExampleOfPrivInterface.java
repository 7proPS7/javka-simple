package car.analizer.util.innerclass.privinterface;

public class ExampleOfPrivInterface {
    private interface Secret {
        String live();
    }

    class DontTell implements Secret {
        public String live() {
            return "LIVE";
        }
    }
}
