package solutions.task9palindromenumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_9 : Palindrome Number")
class SolutionTest {

    @Nested
    @DisplayName("Test method: isPalindrome(int x)")
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
            int x = 121;

            // when
            boolean output = solution.isPalindrome(x);

            // then
            assertTrue(output);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int x = -121;

            // when
            boolean output = solution.isPalindrome(x);

            // then
            assertFalse(output);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int x = 10;

            // when
            boolean output = solution.isPalindrome(x);

            // then
            assertFalse(output);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int x = 0;

            // when
            boolean output = solution.isPalindrome(x);

            // then
            assertTrue(output);
        }
    }
}