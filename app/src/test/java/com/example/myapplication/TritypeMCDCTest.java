package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 3));
        assertEquals(4, tri.Triang(2, 1, 3));
        assertEquals(4, tri.Triang(3, 2, 1));
        assertEquals(4, tri.Triang(5, 6, 7));

    }
}