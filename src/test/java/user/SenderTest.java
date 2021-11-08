package user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {

    @Test
    void getId() {
        User sender1 = new Sender();
        User sender2 = new Sender();
        User receiver1 = new Receiver();
        User sender3 = new Sender();
        assertEquals(sender1.getId(),1);
        assertEquals(sender2.getId(),2);
        assertEquals(sender3.getId(),4);
    }
}