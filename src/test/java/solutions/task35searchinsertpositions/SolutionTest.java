package solutions.task35searchinsertpositions;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_35 : Test Search Insert Positions")
class SolutionTest {

    @Nested
    @DisplayName("Test method: searchInsert(int[] nums, int target)")
    class Task35 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] nums = {1, 3, 5, 6};
            int target = 5;

            // when
            int result = solution.searchInsert(nums, target);
            int expected = 2;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {1, 3, 5, 6};
            int target = 2;

            // when
            int result = solution.searchInsert(nums, target);
            int expected = 1;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {1, 3, 5, 6};
            int target = 7;

            // when
            int result = solution.searchInsert(nums, target);
            int expected = 4;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 4")
        @Test
        void test_4() {
            // prepare
            int[] nums = {1, 3, 5, 6};
            int target = 0;

            // when
            int result = solution.searchInsert(nums, target);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 5")
        @Test
        void test_5() {
            // prepare
            int[] nums = {1};
            int target = 0;

            // when
            int result = solution.searchInsert(nums, target);
            int expected = 0;

            // then
            assertEquals(expected, result);
        }
    }
}