package solutions.task242validanagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Task_242. Valid Anagram")
class SolutionTest {

    @Nested
    @DisplayName("Test method: isAnagram(String s, String t)")
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
            String s = "anagram";
            String t = "nagaram";

            // when
            boolean result = solution.isAnagram(s,t);

            // then
            assertTrue(result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "rat";
            String t = "car";

            // when
            boolean result = solution.isAnagram(s,t);

            // then
            assertFalse(result);
        }
    }
}