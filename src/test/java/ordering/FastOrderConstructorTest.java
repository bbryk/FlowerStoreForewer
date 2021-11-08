package ordering;

import org.junit.jupiter.api.Test;
import ordering.FastOrderConstructor;
import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {

    @Test
    void createOrder() {
        Order order = FastOrderConstructor.createOrder();
        assertEquals(order.calculateTotalPrice(), 0.0);
    }
}