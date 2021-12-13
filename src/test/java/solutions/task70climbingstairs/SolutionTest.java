package solutions.task70climbingstairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_70 : Climbing Stairs")
class SolutionTest {

    @Nested
    @DisplayName("Test method: climbStairs(int n)")
    class Task70 {
        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int n = 5;
            int expected = 8;

            // when
            int result = solution.climbStairs(n);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int n = 3;
            int expected = 3;

            // when
            int result = solution.climbStairs(n);

            // then
            assertEquals(expected, result);
        }
    }
}