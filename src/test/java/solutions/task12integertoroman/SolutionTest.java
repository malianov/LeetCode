package solutions.task12integertoroman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_12 : Integer to Roman")
class SolutionTest {

    @Nested
    @DisplayName("Test method: intToRoman(int num)")
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
            int input = 3;

            // when
            String result = solution.intToRoman(input);
            String expected = "III";

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int input = 58;

            // when
            String result = solution.intToRoman(input);
            String expected = "LVIII";

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int input = 1994;

            // when
            String result = solution.intToRoman(input);
            String expected = "MCMXCIV";

            // then
            assertEquals(expected, result);
        }
    }
}