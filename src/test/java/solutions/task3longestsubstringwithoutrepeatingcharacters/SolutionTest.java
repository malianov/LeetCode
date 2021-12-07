package solutions.task3longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_3 : Longest Substring Without Repeating Characters")
class SolutionTest {

    @Nested
    @DisplayName("Test method: lengthOfLongestSubstring(String s)")
    class Task3 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String s = "abcabcbb";

            // when
            int result = solution.lengthOfLongestSubstring(s);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "bbbbb";

            // when
            int result = solution.lengthOfLongestSubstring(s);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s = "pwwkew";

            // when
            int result = solution.lengthOfLongestSubstring(s);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            String s = "";

            // when
            int result = solution.lengthOfLongestSubstring(s);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            String s = "dvdf";

            // when
            int result = solution.lengthOfLongestSubstring(s);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }
    }
}