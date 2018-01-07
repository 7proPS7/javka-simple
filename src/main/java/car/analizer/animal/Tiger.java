package car.analizer.animal;

import car.analizer.animal.response.SpeedType;
import car.analizer.animal.service.Sprint;

public class Tiger implements Sprint {
    public String sprint(Animal animal) {
        return SpeedType.FAST.toString();
    }
}
