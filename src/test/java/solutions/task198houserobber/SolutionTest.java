package solutions.task198houserobber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task 198 : House Robber")
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
            int[] nums = {1,2,3,1};

            // when
            int result = solution.rob(nums);
            int expected = 4;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {2,7,9,3,1};

            // when
            int result = solution.rob(nums);
            int expected = 12;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {2,1};

            // when
            int result = solution.rob(nums);
            int expected = 2;

            // then
            assertEquals(expected, result);
        }
    }
}