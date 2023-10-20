package edu.hw1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static edu.hw1.Task4.fixString;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class Task4Test {
    @Test
    @DisplayName("string without spaces")
    void testStringWithoutSpaces(){
        assertThat(fixString("123456")).isEqualTo("214365");
        assertThat(fixString("badce")).isEqualTo("abcde");
    }

    @Test
    @DisplayName("string with spaces")
    void testStringWithSpaces() {
        assertThat(fixString("hTsii  s aimex dpus rtni.g"))
            .isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("empty string")
    void testEmptyString() {
        assertThat(fixString("")).isEqualTo("");
    }

    @Test
    @DisplayName("string is null")
    void testStringIsNull() {
        assertThat(fixString(null)).isEqualTo("");
    }

}
