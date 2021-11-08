package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {



    @Test
    void getId() {
        User receiver1 = new Receiver();
        User receiver2 = new Receiver();
        assertEquals(receiver1.getId(),1);
        assertEquals(receiver2.getId(),2);
    }
}