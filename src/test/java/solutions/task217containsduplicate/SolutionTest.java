package solutions.task217containsduplicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Task 217 : Contains Duplicate")
class SolutionTest {

    @Nested
    @DisplayName("Test method: containsDuplicate(int[] nums)")
    class Task217 {

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
            boolean result = solution.containsDuplicate(nums);

            // then
            assertTrue(result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] nums = {1,2,3,4};

            // when
            boolean result = solution.containsDuplicate(nums);

            // then
            assertFalse(result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            int[] nums = {1,1,1,3,3,4,3,2,4,2};

            // when
            boolean result = solution.containsDuplicate(nums);

            // then
            assertTrue(result);
        }
    }
}