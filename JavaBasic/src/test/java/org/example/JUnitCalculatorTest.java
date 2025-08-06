package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculatorTest {
    @Test
    public void testAdd() {
        JUnitCalculator calc = new JUnitCalculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testAdd2() {
        JUnitCalculator calc = new JUnitCalculator();
        assertEquals(-5, calc.add(-2, -3));
    }
}
