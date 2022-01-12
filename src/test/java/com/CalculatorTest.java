package com;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest 
{
    
    @Test
    public void testAdd()
    {
	Calculator c1 = new Calculator();
	int actual = c1.add(10,20);
	int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void testSub()
    {
	Calculator c1 = new Calculator();
	int actual = c1.add(10,20);
	int expected = 10;
        assertEquals(expected, actual);
    }
}
