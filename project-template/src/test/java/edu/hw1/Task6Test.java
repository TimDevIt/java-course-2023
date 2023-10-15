package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task6.countK;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task6Test {
    @Test
    @DisplayName("number = 3524")
    void testValidNumber() {
        assertThat(countK(3524)).isEqualTo(3);
    }
}
