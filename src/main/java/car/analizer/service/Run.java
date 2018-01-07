package car.analizer.service;

public interface Run {
    int MAX_SPEED = 100;

    static double calculateSpeed(float distance, double time) {
        return distance / time;
    }

    int getStepSize() throws Exception;

    default String stop() {
        return "Animal is stopping";
    }
}
