package solutions.task977squaresofasortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_977 : Test Squares of a Sorted Array")
class SolutionTest {

    @Nested
    @DisplayName("Test method: search(int[] nums, int target)")
    class Task977 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {-4,-1,0,3,10};
            int[] expected = {0,1,9,16,100};

            // when
            int[] result = solution.sortedSquares(nums);

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {-7,-3,2,3,11};
            int[] expected = {4,9,9,49,121};

            // when
            int[] result = solution.sortedSquares(nums);

            // then
            assertArrayEquals(expected, result);
        }
    }
}