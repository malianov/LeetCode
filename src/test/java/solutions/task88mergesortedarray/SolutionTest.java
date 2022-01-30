package solutions.task88mergesortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Task 88. Merge Sorted Array")
class SolutionTest {

    @Nested
    @DisplayName("Test method: merge(int[] nums1, int m, int[] nums2, int n)")
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
            int[] nums_1 = {1,2,3,0,0,0};
            int m = 3;
            int[] nums_2 = {2,5,6};
            int n = 3;
            int[] expected = {1,2,2,3,5,6};

            // when
            solution.merge(nums_1, m, nums_2, n);

            // then
            assertArrayEquals(expected, nums_1);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums_1 = {1};
            int m = 1;
            int[] nums_2 = {};
            int n = 0;
            int[] expected = {1};

            // when
            solution.merge(nums_1, m, nums_2, n);

            // then
            assertArrayEquals(expected, nums_1);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums_1 = {0};
            int m = 0;
            int[] nums_2 = {1};
            int n = 1;
            int[] expected = {1};

            // when
            solution.merge(nums_1, m, nums_2, n);

            // then
            assertArrayEquals(expected, nums_1);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int[] nums_1 = {4,5,6,0,0,0};
            int m = 3;
            int[] nums_2 = {1,2,3};
            int n = 3;
            int[] expected = {1,2,3,4,5,6};

            // when
            solution.merge(nums_1, m, nums_2, n);

            // then
            assertArrayEquals(expected, nums_1);
        }
    }
}