package car.analizer.util.innerclass.anonymous;

public class Sale {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(final int basePrice) {
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 10;
            }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }
}
