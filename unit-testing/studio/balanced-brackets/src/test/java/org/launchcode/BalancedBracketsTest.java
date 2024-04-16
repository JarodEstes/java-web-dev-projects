package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketInWrongOrderFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "]["));
    }

//    @Test
//    public void stringWrappedInBracketsReturnTrue() {
//        assertTrue()
//    }


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}