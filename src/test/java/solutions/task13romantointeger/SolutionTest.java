package solutions.task13romantointeger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_13 : Roman to Integer")
class SolutionTest {

    @Nested
    @DisplayName("Test method: romanToInt(String s)")
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
            String s = "III";

            // when
            int result = solution.romanToInt(s);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "LVIII";

            // when
            int result = solution.romanToInt(s);
            int expected = 58;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s = "MCMXCIV";

            // when
            int result = solution.romanToInt(s);
            int expected = 1994;

            // then
            assertEquals(expected, result);
        }
    }
}