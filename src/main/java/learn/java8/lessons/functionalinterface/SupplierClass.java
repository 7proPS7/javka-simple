package learn.java8.lessons.functionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

class SupplierClass {
    private Supplier<LocalDate> supplier1 = LocalDate::now;
    private Supplier<LocalDate> supplier2 = () -> LocalDate.now();

    private LocalDate date1 = supplier1.get();
    private LocalDate date2 = supplier2.get();

    public LocalDate getDate1() {
        return date1;
    }

    public LocalDate getDate2() {
        return date2;
    }
}
