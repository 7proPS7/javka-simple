package car.analizer.util.innerclass.anonymous;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SaleTest {
    private final int BASE_PRICE = 20;

    @Test
    void checkAdmissionValue() {
        Sale sale = new Sale();
        Assertions.assertEquals(10, sale.admission(BASE_PRICE));
    }

    @Test
    void checkPayMethodCorrectness() {
        Sale sale = new Sale();
        Assertions.assertEquals(15, sale.pay(BASE_PRICE));
    }

}