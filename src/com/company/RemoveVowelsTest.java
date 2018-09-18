package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;
    @Before
    public void setUp() throws Exception {
        removeVowels=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels=null;
    }

    @Test
    public void removeVowel() {
        assertEquals("Inb",removeVowels.removeVowel("Ianiiiiiib"));
    }
}