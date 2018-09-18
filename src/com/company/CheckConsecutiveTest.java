package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveTest {
    CheckConsecutive checkConsecutive;
    @Before
    public void setUp() throws Exception {
        checkConsecutive=new CheckConsecutive();
    }

    @After
    public void tearDown() throws Exception {
        checkConsecutive=null;
    }

    @Test
    public void check() {
        assertTrue(checkConsecutive.check("23,24,25,26"));
        assertFalse(checkConsecutive.check("24,24,25,26"));
        assertFalse(checkConsecutive.check("23,24,25,20"));
    }
}