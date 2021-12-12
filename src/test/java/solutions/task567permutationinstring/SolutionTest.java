package solutions.task567permutationinstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_567 : Permutation in String")
class SolutionTest {

    @Nested
    @DisplayName("Test method: checkInclusion(String s1, String s2)")
    class Task567 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String s1 = "ab";
            String s2 = "eidbaooo";

            // when
            boolean result = solution.checkInclusion(s1, s2);

            // then
            assertTrue(result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s1 = "ab";
            String s2 = "eidboaoo";

            // when
            boolean result = solution.checkInclusion(s1, s2);

            // then
            assertFalse(result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s1 = "adc";
            String s2 = "dcda";

            // when
            boolean result = solution.checkInclusion(s1, s2);

            // then
            assertTrue(result);
        }
    }
}