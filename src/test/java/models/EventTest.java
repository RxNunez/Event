package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class EventTest {

    @Test
    public void newEvent_recognizeObjects() {
        Event testEvents = new Event(1, 1, 2 , 3);
        assertEquals(true, testEvents instanceof Event);
    }

}

