package solutions.task557reversewordsinastringIII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_557 : Reverse Words in a String III")
class SolutionTest {

    @Nested
    @DisplayName("Test method: reverseWords(String s)")
    class Task557 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            String s = "Let's take LeetCode contest";
            String expected = "s'teL ekat edoCteeL tsetnoc";

            // when
            String result = solution.reverseWords(s);
            System.out.println("RESULT = " + result);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "God Ding";
            String expected = "doG gniD";

            // when
            String result = solution.reverseWords(s);

            // then
            assertEquals(result, expected);
        }
    }
}