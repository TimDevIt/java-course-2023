package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static edu.hw1.Task1.minutesToSeconds;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @ParameterizedTest(name="Test minutesToSeconds() Method with parameter={0}")
    @MethodSource("dataProvider")
    void testMinutesToSeconds(String time, int expectedSeconds){
        int actualSeconds = minutesToSeconds(time);
        assertEquals(actualSeconds,expectedSeconds);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
            Arguments.of("15:44", 944),
            Arguments.of("20:00", 1200),
            Arguments.of("00:15", 15),
            Arguments.of("07:99", -1)
        );
    }
}
