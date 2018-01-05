package car.analizer.seasons;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), AUTUMN("Medium");

    private String expectedVisitors;

    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public String printExpectedVisitors() {
        return expectedVisitors;
    }
}
