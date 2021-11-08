package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {



    @Test
    void getId() {
        User receiver1 = new Receiver();
        User sender1 = new Sender();
        User receiver2 = new Receiver();
        User sender2 = new Sender();
        assertEquals(receiver1.getId(),1);
        assertEquals(receiver2.getId(),3);
        assertEquals(sender1.getId(),2);
        assertEquals(sender2.getId(),4);
    }
}