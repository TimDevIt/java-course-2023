package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task1.minutesToSeconds;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("minutes and seconds")
    void testMinutesAndSeconds(){
        int seconds = minutesToSeconds("15:44");
        assertThat(seconds).isEqualTo(944);
    }

    @Test
    @DisplayName("only minutes")
    void testOnlyMinutes(){
        int seconds = minutesToSeconds("20:00");
        assertThat(seconds).isEqualTo(1200);
    }

    @Test
    @DisplayName("only seconds")
    void testOnlySeconds(){
        int seconds = minutesToSeconds("00:15");
        assertThat(seconds).isEqualTo(15);
    }

    @Test
    @DisplayName("invalid seconds")
    void testInvalidSeconds(){
        int seconds = minutesToSeconds("07:99");
        assertThat(seconds).isEqualTo(-1);
    }
}
