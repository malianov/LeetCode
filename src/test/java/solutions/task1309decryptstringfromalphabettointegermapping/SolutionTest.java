package solutions.task1309decryptstringfromalphabettointegermapping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1309 : Decrypt String from Alphabet to Integer Mapping")
class SolutionTest {

    @Nested
    @DisplayName("Test method: freqAlphabets(String s)")
    class Task_1 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String input = "10#11#12";
            String expected = "jkab";

            // when
            String result = solution.freqAlphabets(input);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String input = "1326#";
            String expected = "acz";

            // when
            String result = solution.freqAlphabets(input);

            // then
            assertEquals(expected, result);
        }
    }
}