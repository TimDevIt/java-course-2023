package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task2.countDigits;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("positive number")
    void testPositiveNumber(){
        assertThat(countDigits(55555)).isEqualTo(5);
        assertThat(countDigits(2023)).isEqualTo(4);
        assertThat(countDigits(0)).isEqualTo(1);
    }

    @Test
    @DisplayName("negative number")
    void testNegativeNumber(){
        assertThat(countDigits(-55555)).isEqualTo(5);
        assertThat(countDigits(-2023)).isEqualTo(4);
        assertThat(countDigits(-0)).isEqualTo(1);
    }
}
