package com.mycompany.app;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by AirShaos on 25/12/16.
 */
public class TestJunit {
    @Test
    public void testAdd(){
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }
}
