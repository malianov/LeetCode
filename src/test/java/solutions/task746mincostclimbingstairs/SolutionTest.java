package solutions.task746mincostclimbingstairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task_746 : Min Cost Climbing Stairs")
class SolutionTest {

    @Nested
    @DisplayName("Test method: minCostClimbingStairs(int[] cost)")
    class Task746 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            int[] cost = {10, 15, 20};
            int expected = 15;

            // when
            int result = solution.minCostClimbingStairs(cost);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            int[] cost = {1,100,1,1,1,100,1,1,100,1};
            int expected = 6;

            // when
            int result = solution.minCostClimbingStairs(cost);

            // then
            assertEquals(expected, result);
        }
    }
}