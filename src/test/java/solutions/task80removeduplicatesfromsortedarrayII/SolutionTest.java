package solutions.task80removeduplicatesfromsortedarrayII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Task 80. Remove Duplicates from Sorted Array II")
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
            int[] nums =     {1,1,1,2,2,3};
            int[] expected = {1,1,2,2,3,3};

            // when
            int[] result = solution.removeDuplicates(nums);

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums =     {0,0,1,1,1,1,2,3,3};
            int[] expected = {0,0,1,1,2,3,3,3,3};

            // when
            int[] result = solution.removeDuplicates(nums);

            // then
            assertArrayEquals(expected, result);
        }
    }
}