package solutions.task1twosum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
            int[] nums = {2,7,11,15};
            int target = 9;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {0, 1};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {3,2,4};
            int target = 6;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {1, 2};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {3,3};
            int target = 6;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {0, 1};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int[] nums = {0,4,3,0};
            int target = 0;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {0, 3};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            int[] nums = {-3,4,3,90};
            int target = 0;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {0, 2};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 6")
        @Test
        void test_6() {
            // prepare
            int[] nums = {3,4,3,90};
            int target = 6;

            // when
            int[] result = solution.twoSum(nums,target);
            int[] expected = {0, 2};

            // then
            assertArrayEquals(expected, result);
        }
    }
}