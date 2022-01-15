package solutions.task102binarytreelevelordertraversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_102 : Binary Tree Level Order Traversal")
class SolutionTest {

    @Nested
    @DisplayName("Test method: levelOrder(TreeNode root)")
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
            TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));

            // when
            List<List<Integer>> result = solution.levelOrder(root);
            List<List<Integer>> expected = List.of(List.of(3), List.of(9,20), List.of(15,7));

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            TreeNode root = new TreeNode(1, null, null);

            // when
            List<List<Integer>> result = solution.levelOrder(root);
            List<List<Integer>> expected = List.of(List.of(1));

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            TreeNode root = null;

            // when
            List<List<Integer>> result = solution.levelOrder(root);
            List<List<Integer>> expected = new ArrayList<>();

            // then
            assertEquals(expected, result);
        }
    }
}