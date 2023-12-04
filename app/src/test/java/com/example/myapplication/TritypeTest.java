package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;


public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 0, 0));
        assertEquals(4, tri.Triang(1, 1, 7));
        assertEquals(4, tri.Triang(1, 2, 1));
        assertEquals(4, tri.Triang(7, 1, 1));
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(1, tri.Triang(3, 2, 4));
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(2, tri.Triang(3, 3, 4));
        assertEquals(2, tri.Triang(3, 4, 3));
        assertEquals(2, tri.Triang(4, 3, 3));



    }
}