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
public class TritypeDecisionTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}