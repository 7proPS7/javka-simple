package car.analizer.util.innerclass.anonymous;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SaleTest {

    @Test
    void checkAdmissionValue() {
        final int BASE_PRICE = 20;
        Sale sale = new Sale();
        Assertions.assertEquals(10, sale.admission(BASE_PRICE));
    }
}