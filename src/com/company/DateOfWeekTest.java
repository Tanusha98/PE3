package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {
    DateOfWeek dateOfWeek;
    @Before
    public void setUp() throws Exception {
        dateOfWeek=new DateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        dateOfWeek=null;
    }
    @Test
    public void getDays(){
        assertArrayEquals(new String[] {"Mon 17/09/2018","Sun 23/09/2018"},dateOfWeek.getDays());
    }
}