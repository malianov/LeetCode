package solutions.task704binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_704 : Test Binary Search")
class SolutionTest {

    @Nested
    @DisplayName("Test method: solution()")
    class Task704 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {-1,0,3,5,9,12};
            int target = 9;

            // when
            int result = solution.search(nums, target);
            int expected = 4;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {-1,0,3,5,9,12};
            int target = 2;

            // when
            int result = solution.search(nums, target);
            int expected = -1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {5};
            int target = 5;

            // when
            int result = solution.search(nums, target);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }
    }
}