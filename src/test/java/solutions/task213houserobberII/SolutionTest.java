package solutions.task213houserobberII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task 213 : House Robber II")
class SolutionTest {

    @Nested
    @DisplayName("Test method: rob(int[] nums)")
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
            int[] nums = {2,3,2};

            // when
            int result = solution.rob(nums);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {1,2,3,1};

            // when
            int result = solution.rob(nums);
            int expected = 4;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {1,2,3};

            // when
            int result = solution.rob(nums);
            int expected = 3;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int[] nums = {0};

            // when
            int result = solution.rob(nums);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            int[] nums = {1};

            // when
            int result = solution.rob(nums);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }
    }
}