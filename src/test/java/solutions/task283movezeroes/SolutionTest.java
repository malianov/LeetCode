package solutions.task283movezeroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_283 : Test Move Zeroes")
class SolutionTest {

    @Nested
    @DisplayName("Test method: moveZeroes(int[] nums)")
    class Task283 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {0,1,0,3,12};

            // when
            solution.moveZeroes(nums);
            int[] expected = {1,3,12,0,0};

            // then
            assertArrayEquals(expected, nums);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {0};

            // when
            solution.moveZeroes(nums);
            int[] expected = {0};

            // then
            assertArrayEquals(expected, nums);
        }
    }
}