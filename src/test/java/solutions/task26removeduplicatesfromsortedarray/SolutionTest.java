package solutions.task26removeduplicatesfromsortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task 26 : Remove Duplicates from Sorted Array")
class SolutionTest {

    @Nested
    @DisplayName("Test method: removeDuplicates(int[] nums)")
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
            int[] nums = {1,1,2};

            // when
            int result = solution.removeDuplicates(nums);
            int expected = 2;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {0,0,1,1,1,2,2,3,3,4};

            // when
            int result = solution.removeDuplicates(nums);
            int expected = 5;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {-3,-1,0,0,0,3,3};

            // when
            int result = solution.removeDuplicates(nums);
            int expected = 4;
            // [-3,-1,0,3]

            // then
            assertEquals(expected, result);
        }
    }
}