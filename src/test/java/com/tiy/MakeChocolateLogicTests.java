package com.tiy;

/**
 * Created by jfabiano on 9/22/2016.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 8/24/2016.
 */
public class MakeChocolateLogicTests {
    MakeChocolate solver;
    @Before
    public void setUp() throws Exception
    {
        solver = new MakeChocolate();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(7, 0, 7);
        assertEquals(7, numSmalls.returnValue);
    }
    @Test
    public void testNoSmallsEnoughBig() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls.returnValue);
    }
    @Test
    public void testEnoughSmallsTooManyBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(25, 7, 25);
        assertEquals(0, numSmalls.returnValue);
    }@Test
    public void testEnoughSmallsEnoughBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(105, 21, 105);
        assertEquals(0, numSmalls.returnValue);
    }@Test
    public void testNoSmallsNoBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(0, 0, 2);
        assertEquals(-1, numSmalls.returnValue);
    }@Test
    public void testNoSmallsTooManyBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(0, 8, 33);
        assertEquals(-1, numSmalls.returnValue);
    }

    @Test
    public void testNoSmallsTooFewBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(0, 11, 70);
        assertEquals(-1, numSmalls.returnValue);
    }

    @Test
    public void testTooManySmallsNoBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(12, 0, 7);
        assertEquals(7, numSmalls.returnValue);
    }

    @Test
    public void testTooManySmallsTooFewBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(12, 1, 9);
        assertEquals(4, numSmalls.returnValue);
    }@Test
    public void testTooManySmallsTooManyBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(76, 16, 63);
        assertEquals(3, numSmalls.returnValue);
    }@Test
    public void testTooManySmallsEnoughBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(100, 16, 80);
        assertEquals(0, numSmalls.returnValue);
    }@Test
    public void testTooFewSmallsNoBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(6, 0, 7);
        assertEquals(-1, numSmalls.returnValue);
    }@Test
    public void testTooFewSmallsTooFewBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(5, 2, 17);
        assertEquals(-1, numSmalls.returnValue);
    }@Test
    public void testTooFewSmallsTooManyBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(1, 20, 38);
        assertEquals(-1, numSmalls.returnValue);
    }@Test
    public void testTooFewSmallsEnoughBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(12, 9, 45);
        assertEquals(0, numSmalls.returnValue);
    }@Test
    public void testEnoughSmallsTooFewBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(13, 2, 13);
        assertEquals(3, numSmalls.returnValue);
    }
    @Test
    public void testNegativeSmallsPositiveBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(-13, 2, 13);
        assertEquals(-1, numSmalls.returnValue);
    }
    @Test
    public void testNegativeSmallsNegativeBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(-5, -12, 56);
        assertEquals(-1, numSmalls.returnValue);
    }
    @Test
    public void testPositiveSmallsNegativeBigs() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(9, -120, 401);
        assertEquals(-1, numSmalls.returnValue);
    }
    @Test
    public void ExtraTest() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(6, 1, 10);
        assertEquals(5, numSmalls.returnValue);
    }
    @Test
    public void ExtraTestTwo() throws Exception
    {
        NeededChocolate numSmalls = solver.makeChocolate(6, 1, 11);
        assertEquals(6, numSmalls.returnValue);
    }

}