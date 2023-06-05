package com.littera.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestOneTest {
    @Test
    public void removeChars_removesCharPassedIn() {
        assertEquals("Hell Wrld", TestOne.removeChars("Hello World", 'o'));
    }
}
