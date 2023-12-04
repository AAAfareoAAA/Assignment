package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
                    Side1+Side3 <= Side2)
                triOut = 4;
            else
                triOut = 1;
            return (triOut);
            */
public class TritypeConditionTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 1, 7));
        assertEquals(4, tri.Triang(6, 6, 7));
        assertEquals(4, tri.Triang(1, 7, 1));
        assertEquals(4, tri.Triang(6, 7, 6));
        assertEquals(4, tri.Triang(7, 1, 1));
        assertEquals(4, tri.Triang(7, 6, 6));
    }
}