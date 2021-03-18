package com.ford.input;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    //Given Test Cases
    @Test
    void convertGiven() {
        Algorithm alg = new Algorithm();
        assertEquals("2", alg.convert(2));
        assertEquals("Mustang", alg.convert(6));
        assertEquals("Bronco", alg.convert(10));
        assertEquals("MustangBronco", alg.convert(15));
    }

    @Test
    void convertNegative() {
        Algorithm alg = new Algorithm();
        assertEquals("-2", alg.convert(-2));
        assertEquals("Mustang", alg.convert(-6));
        assertEquals("Bronco", alg.convert(-10));
        assertEquals("MustangBronco", alg.convert(-15));
    }

    @Test
    void convertEdgeCasesMax() {
        Algorithm alg = new Algorithm();
        assertEquals("2147483647", alg.convert(Integer.MAX_VALUE));
        assertEquals("Mustang", alg.convert(Integer.MAX_VALUE - 1));
        assertEquals("Bronco", alg.convert(Integer.MAX_VALUE - 2));
        assertEquals("MustangBronco", alg.convert(Integer.MAX_VALUE - 7));
    }

    @Test
    void convertEdgeCasesMin() {
        Algorithm alg = new Algorithm();
        assertEquals("-2147483648", alg.convert(Integer.MIN_VALUE));
        assertEquals("Mustang", alg.convert(Integer.MIN_VALUE + 2));
        assertEquals("Bronco", alg.convert(Integer.MIN_VALUE + 3));
        assertEquals("MustangBronco", alg.convert(Integer.MIN_VALUE + 8));
    }
}