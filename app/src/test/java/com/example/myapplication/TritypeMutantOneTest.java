package com.example.myapplication;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TritypeMutantOneTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(2, Tritype.Triang(4, 5, 7));
    }
}