package learn.java8.lessons.functionalinterface;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierClassTest {

    @Test
    public void shouldGetCurrentDate() {
        assertThat(new SupplierClass().getDate1()).isEqualTo(LocalDate.now());
        assertThat(new SupplierClass().getDate2()).isEqualTo(LocalDate.now());
    }
}