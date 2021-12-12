package solutions.task189rotatearray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_189 : Test Rotate Array")
class SolutionTest {

    @Nested
    @DisplayName("Test method: rotate(int[] nums, int k)")
    class Task189 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {1,2,3,4,5,6,7};
            int k = 3;
            int[] expected = {5,6,7,1,2,3,4};

            // when
            solution.rotate(nums, k);

            // then
            assertArrayEquals(nums, expected);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {-1,-100,3,99};
            int k = 2;
            int[] expected = {3,99,-1,-100};

            // when
            solution.rotate(nums, k);

            // then
            assertArrayEquals(expected, nums);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {-1};
            int k = 2;
            int[] expected = {-1};

            // when
            solution.rotate(nums, k);

            // then
            assertArrayEquals(expected, nums);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int[] nums = {1,2};
            int k = 3;
            int[] expected = {2,1};

            // when
            solution.rotate(nums, k);

            // then
            assertArrayEquals(expected, nums);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            int[] nums = {1,2};
            int k = 5;
            int[] expected = {2,1};

            // when
            solution.rotate(nums, k);

            // then
            assertArrayEquals(expected, nums);
        }
    }
}