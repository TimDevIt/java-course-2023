package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task6.countK;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task6Test {
    @Test
    @DisplayName("the number consists of 4 digits, and not all digits are equal")
    void testValidNumber() {
        assertThat(countK(3524)).isEqualTo(3);
        assertThat(countK(6621)).isEqualTo(5);
        assertThat(countK(6554)).isEqualTo(4);
        assertThat(countK(1234)).isEqualTo(3);
    }

    @Test
    @DisplayName("the number of digits is not equal to 4")
    void testWrongNumberOfDigits(){
        assertThat(countK(35246)).isEqualTo(-1);
        assertThat(countK(662)).isEqualTo(-1);
        assertThat(countK(1)).isEqualTo(-1);
    }

    @Test
    @DisplayName("All digit are same")
    void testAllDigitAreSame(){
        assertThat(countK(9999)).isEqualTo(-1);
        assertThat(countK(6666)).isEqualTo(-1);
        assertThat(countK(1111)).isEqualTo(-1);
    }
}
