package solutions.task53maximumsubarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_53 : Maximum Subarray")
class SolutionTest {

    @Nested
    @DisplayName("Test method: maxSubArray(int[] nums")
    class Task53 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            int expected = 6;

            // when
            int result = solution.maxSubArray(nums);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {1};
            int expected = 1;

            // when
            int result = solution.maxSubArray(nums);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {5,4,-1,7,8};
            int expected = 23;

            // when
            int result = solution.maxSubArray(nums);

            // then
            assertEquals(expected, result);
        }
    }
}