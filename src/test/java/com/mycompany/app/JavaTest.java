package com.mycompany.app;

import junit.framework.TestCase;

/**
 * Created by AirShaos on 25/12/16.
 */
public class JavaTest extends TestCase {
    protected int value1, value2;
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    public void testAdd(){
        double result = value1 + value2;
        assertTrue(result == 6);
    }
}
