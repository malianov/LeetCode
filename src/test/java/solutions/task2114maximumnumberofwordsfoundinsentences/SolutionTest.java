package solutions.task2114maximumnumberofwordsfoundinsentences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task 2114 : Maximum Number of Words Found in Sentences")
class SolutionTest {

    @Nested
    @DisplayName("Test method: mostWordsFound(String[] sentences)")
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
            String[] strings = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

            // when
            int result = solution.mostWordsFound(strings);
            int expected = 6;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String[] strings = {"please wait", "continue to fight", "continue to win"};

            // when
            int result = solution.mostWordsFound(strings);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }
    }
}