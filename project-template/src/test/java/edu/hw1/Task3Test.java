package edu.hw1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task3.isNestable;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {
    @Test
    @DisplayName("valid arrays and completed condition ")
    void testValidArraysAndCompletedCondition(){
        assertThat(isNestable(new int[]{1, 2, 3, 4},new int[]{0, 6})).isTrue();
        assertThat(isNestable(new int[]{1, 3},new int[]{4, 0})).isTrue();
    }

    @Test
    @DisplayName("valid arrays and failed condition ")
    void testValidArraysAndFailedCondition(){
        assertThat(isNestable(new int[]{1, 3, 5, 7},new int[]{2, 4})).isFalse();
    }

    @Test
    @DisplayName("null arrays")
    void testNullArrays(){
       assertFalse(isNestable(null,new int[]{2, 4}));
       assertFalse(isNestable(new int[]{1, 3, 5, 7}, null));
       assertFalse(isNestable(null,null));
    }

    @Test
    @DisplayName("empty arrays")
    void testEmptyArrays(){
        assertFalse(isNestable(new int[]{},new int[]{}));
        assertFalse(isNestable(new int[]{1, 3, 5, 7},new int[]{}));
        assertFalse(isNestable(new int[]{},new int[]{2, 4}));
    }


}
