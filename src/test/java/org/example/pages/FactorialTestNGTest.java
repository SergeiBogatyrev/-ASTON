package org.example.pages;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTestNGTest {

    @Test
    public void testGetFactorial() {
        FactorialTestNG a = new FactorialTestNG();
        long actual = a.getFactorial(5);
        long expected = 120;
        assertEquals(expected,actual);

    }
}