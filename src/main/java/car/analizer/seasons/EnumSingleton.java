package car.analizer.seasons;

public enum EnumSingleton {
    ONCE(true);
    private EnumSingleton(boolean val){
        System.out.println("constructing");
    }
}
