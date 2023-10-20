package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task7.rotateLeft;
import static edu.hw1.Task7.rotateRight;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task7Test {
    @Test
    @DisplayName("Rotating a number to the left")
    void testRotatingNumberLeft(){
        assertThat(rotateLeft(16, 1)).isEqualTo(1);
        assertThat(rotateLeft(17, 2)).isEqualTo(6);
    }

    @Test
    @DisplayName("Rotating a number to the right")
    void testRotatingNumberRight(){
        assertThat(rotateRight(8, 1)).isEqualTo(4);
    }
}
