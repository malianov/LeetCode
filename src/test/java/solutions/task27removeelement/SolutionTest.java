package solutions.task27removeelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Task 27. Remove Element")
class SolutionTest {

    @Nested
    @DisplayName("Test method: removeElement(int[] nums, int val)")
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
            int[] nums = {3,2,2,3};
            int val = 3;

            // when
            int[] result = solution.removeElement(nums, val);
            int[] expected = {2,2,2,3};

            // then
            assertArrayEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {0,1,2,2,3,0,4,2};
            int val = 2;

            // when
            int[] result = solution.removeElement(nums, val);
            int[] expected = {0,1,3,0,4,0,4,2};

            // then
            assertArrayEquals(expected, result);
        }
    }
}