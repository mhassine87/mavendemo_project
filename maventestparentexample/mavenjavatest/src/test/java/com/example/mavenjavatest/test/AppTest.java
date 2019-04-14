package com.example.mavenjavatest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd() {
            assertEquals(10,new Calc().add(9,1));

    }

    @Test
    public void testDiv() {
        assertEquals(10,new Calc().div(100,10));

    }

    @Test
    public void testSubstract() {
        assertEquals(4,new Calc().substract(10, 6));

    }

    @Test
    public void testMult(){
        assertEquals(20,new Calc().mult(5, 4));

    }
}
