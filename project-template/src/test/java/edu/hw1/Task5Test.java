package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task5.isPalindromeDescendant;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task5Test {
    @Test
    @DisplayName("number with even length ")
    void testNumberWithEvenLength(){
        assertTrue(isPalindromeDescendant(11211230));
        assertTrue(isPalindromeDescendant(13001120));
        assertTrue(isPalindromeDescendant(23336014));
        assertFalse(isPalindromeDescendant(12345678));
    }

    @Test
    @DisplayName("number with odd length")
    void testNumberWithOddLength(){
        assertFalse(isPalindromeDescendant(1));
        assertFalse(isPalindromeDescendant(123));
        assertFalse(isPalindromeDescendant(12345));
    }

}
