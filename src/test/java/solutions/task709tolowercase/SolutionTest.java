package solutions.task709tolowercase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_1 : Two sum")
class SolutionTest {

    @Nested
    @DisplayName("Test method: twoSum(int[] nums, int target")
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
            String s = "Hello";
            String expected = "hello";

            // when
            String result = solution.toLowerCase(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            String s = "here";
            String expected = "here";

            // when
            String result = solution.toLowerCase(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            String s = "LOVELY";
            String expected = "lovely";

            // when
            String result = solution.toLowerCase(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            String s = "PiTAs";
            String expected = "pitas";

            // when
            String result = solution.toLowerCase(s);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            String s = "al&phaBET";
            String expected = "al&phabet";

            // when
            String result = solution.toLowerCase(s);

            // then
            assertEquals(expected, result);
        }
    }
}