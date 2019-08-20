package com.qa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{

    App app = new App();

    @Test
    public void blackJackTest()
    {
        assertEquals("Expected: 21 should win",21,app.play(21, 22));
        assertEquals("Expected: 21 should win",21,app.play(22, 21));
        assertEquals("Expected: 0",0,app.play(22, 95));
        assertEquals("Expected: 21 should win",21,app.play(21, 18));
        assertEquals("Expected: 21 should win",21,app.play(18, 21));
        assertEquals("Expected: 18 should win",18,app.play(18, 5));
        assertEquals("Expected: 19 should win",19,app.play(5, 19));
    }
}
