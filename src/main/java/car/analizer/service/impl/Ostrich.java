package car.analizer.service.impl;

import car.analizer.service.Run;

public class Ostrich implements Run {
    public int getStepSize() throws Exception {
        return 50;
    }

    public String stop() {
        return "Ostrich is stopping slow";
    }
}
