package com.example.unittesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Util util = new Util();
    @Test
    public void testGetModName(){
        assertEquals("Bob", util.getModName("Bob", false));
        assertEquals("Bob modded", util.getModName("Bob", true));
    }

    @Test
    public void addition_isCorrect() {
        Util util = new Util();
        //assertEquals(4, 2 + 2);
        assertEquals("rico", util.getName());
    }
}