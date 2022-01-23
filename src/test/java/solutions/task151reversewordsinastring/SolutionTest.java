package solutions.task151reversewordsinastring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Task 151. Reverse Words in a String")
class SolutionTest {

    @Nested
    @DisplayName("Test method: reverseWords(String s)")
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
            String input = "the sky is blue";
            String expected = "blue is sky the";

            // when
            String result = solution.reverseWords(input);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String input = "  hello world  ";
            String expected = "world hello";

            // when
            String result = solution.reverseWords(input);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String input = "a good   example";
            String expected = "example good a";

            // when
            String result = solution.reverseWords(input);

            // then
            assertEquals(expected, result);
        }
    }
}