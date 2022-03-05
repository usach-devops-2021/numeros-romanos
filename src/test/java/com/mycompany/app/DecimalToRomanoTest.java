package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalToRomanoTest {

    @Test
    public void testDecToRomano(){
        assertEquals("I",NumeroRomano.decToRomano(1));
        assertEquals("II",NumeroRomano.decToRomano(2));
        assertEquals("IV",NumeroRomano.decToRomano(4));
        assertEquals("V",NumeroRomano.decToRomano(5));
        assertEquals("IX",NumeroRomano.decToRomano(9));
        assertEquals("X",NumeroRomano.decToRomano(10));
        assertEquals("XI",NumeroRomano.decToRomano(11));
        assertEquals("XII",NumeroRomano.decToRomano(12));
        assertEquals("XIV",NumeroRomano.decToRomano(14));
        assertEquals("XV",NumeroRomano.decToRomano(15));
        assertEquals("XIX",NumeroRomano.decToRomano(19));
        assertEquals("XX",NumeroRomano.decToRomano(20));
        assertEquals("XLI",NumeroRomano.decToRomano(41));
        assertEquals("XLII",NumeroRomano.decToRomano(42));
        assertEquals("XLIV",NumeroRomano.decToRomano(44));
        assertEquals("XLV",NumeroRomano.decToRomano(45));
        assertEquals("XLIX",NumeroRomano.decToRomano(49));
        assertEquals("L",NumeroRomano.decToRomano(50));
        assertEquals("LI",NumeroRomano.decToRomano(51));
        assertEquals("LII",NumeroRomano.decToRomano(52));
        assertEquals("LIV",NumeroRomano.decToRomano(54));
        assertEquals("LV",NumeroRomano.decToRomano(55));
        assertEquals("LIX",NumeroRomano.decToRomano(59));
        assertEquals("XC",NumeroRomano.decToRomano(90));
        assertEquals("XCI",NumeroRomano.decToRomano(91));
        assertEquals("XCII",NumeroRomano.decToRomano(92));
        assertEquals("XCIV",NumeroRomano.decToRomano(94));
        assertEquals("XCV",NumeroRomano.decToRomano(95));
        assertEquals("XCIX",NumeroRomano.decToRomano(99));
        assertEquals("C",NumeroRomano.decToRomano(100));
    }
    
}
