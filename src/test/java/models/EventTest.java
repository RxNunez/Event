package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class EventTest {

    @Test
    public void newEvent_recognizeObjects() {
        Event testEvents = new Event(1, 1, 2 , 3, 1);
        assertEquals(true, testEvents instanceof Event);
    }
    @Test
    public void newEvent_getGuests_10() {
        Event testEvents = new Event(10, 1, 1, 1, 1);
        assertEquals(Integer.valueOf(10), testEvents.getGuests());
    }
    @Test
    public void newEvent_getMeals() {
        Event testEvents = new Event(8, 1, 1, 1, 1);
        String expectedOutput = "";
        assertEquals(expectedOutput, testEvents.getMealOption());
    }
    @Test
    public void newEvent_getBeverages() {
        Event testEvents = new Event(8, 1, 1, 1, 1);
        String expectedOutput = "";
        assertEquals(expectedOutput, testEvents.getBeverageOption());
    }
    @Test
    public void newEvent_getEntertainment() {
        Event testEvents = new Event(8, 1, 1, 1, 1);
        String expectedOutput = "";
        assertEquals(expectedOutput, testEvents.getEntertainmentOption());
    }
    @Test
    public void newEvent_getCost_10() {
        Event testEvents = new Event(10, 1, 1, 1, 1);
        assertEquals(Integer.valueOf(10), testEvents.getCost());
    }
    @Test
    public void newEvent_calculateTotal_2000() {
        Event testEvents = new Event(20, 1, 1, 1, 1);
        assertEquals(Integer.valueOf(2000), testEvents.billTotal());
    }
    @Test
    public void newEvent_pickMeal() {
        Event testEvents = new Event(10, 2, 1, 1, 1);
        String expectedOutput = "Seafood/Vegan";
        assertEquals(expectedOutput, testEvents.pickMeal());
    }
    @Test
    public void newEvent_pickBeverage() {
        Event testEvents = new Event(10, 2, 1, 1, 1);
        String expectedOutput = "Alcoholic";
        assertEquals(expectedOutput, testEvents.pickBeverage());
    }
    @Test
    public void newEvent_pickEntertainment() {
        Event testEvents = new Event(10, 2, 1, 2, 1);
        String expectedOutput = "DJ";
        assertEquals(expectedOutput, testEvents.pickEntertainment());
    }
    @Test
    public void newEvent_pickDiscount() {
        Event testEvents = new Event(10, 2, 1, 2, 1);
        String expectedOutput = "Winter Months";
        assertEquals(expectedOutput, testEvents.pickDiscount());
    }

}

