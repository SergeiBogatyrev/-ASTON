package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialJunit5Test {

    @Test
    void getFactorial() {
        FactorialJunit5 a = new FactorialJunit5();
        long actual = a.getFactorial(5);
        long expected = 120;
        assertEquals(expected,actual);
    }
}