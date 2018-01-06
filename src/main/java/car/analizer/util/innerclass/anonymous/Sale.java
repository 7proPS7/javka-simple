package car.analizer.util.innerclass.anonymous;

public class Sale {
    public int pay(final int basePrice) {
        return admission(basePrice, new SaleTodayOnly() {
            public int dollarsOff() {
                return 5;
            }
        });
    }

    public int admission(final int basePrice, SaleTodayOnly saleTodayOnly) {
        return basePrice - saleTodayOnly.dollarsOff();
    }

    @Deprecated
    public int admission(final int basePrice) {
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            public int dollarsOff() {
                return 10;
            }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }
}
