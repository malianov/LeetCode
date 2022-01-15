package solutions.task637averageoflevelsinbinarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_637 : Average of Levels in Binary Tree")
class SolutionTest {

    @Nested
    @DisplayName("Test method: averageOfLevels(TreeNode root)")
    class Task3 {

        public Solution solution;

        @BeforeEach
        public void initEach() {
            solution = new Solution();
        }

        @DisplayName("Test 1")
        @Test
        void test_1() {
            // prepare
            TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(15, null, null), new TreeNode(7, null, null)), new TreeNode(20, null, null));

            // when
            List<Double> result = solution.averageOfLevels(root);
            List<Double> expected = List.of(3.00000, 14.50000, 11.00000);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));

            // when
            List<Double> result = solution.averageOfLevels(root);
            List<Double> expected = List.of(3.00000, 14.50000, 11.00000);

            // then
            assertEquals(expected, result);
        }
    }
}