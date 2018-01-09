package car.analizer.util.innerclass.anonymous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SaleTest {
    private final int BASE_PRICE = 20;

    @Test
    void checkAdmissionValue() {
        Sale sale = new Sale();
        assertThat(10).isEqualTo(sale.admission(BASE_PRICE));
    }

    @Test
    void checkPayMethodCorrectness() {
        Sale sale = new Sale();
        assertThat(15).isEqualTo(sale.pay(BASE_PRICE));
    }

}