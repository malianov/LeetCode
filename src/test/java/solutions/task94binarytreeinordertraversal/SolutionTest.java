package solutions.task94binarytreeinordertraversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task_94 : Binary Tree Inorder Traversal")
class SolutionTest {

    @Nested
    @DisplayName("Test method: inorderTraversal(TreeNode root)")
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
            TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));

            // when
            List<Integer> result = solution.inorderTraversal(root);
            List<Integer> expected = List.of(1, 3, 2);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 2")
        @Test
        void test_2() {
            // prepare
            TreeNode root = null;

            // when
            List<Integer> result = solution.inorderTraversal(root);
            List<Integer> expected = new ArrayList<>(0);

            // then
            assertEquals(expected, result);
        }

        @DisplayName("Test 3")
        @Test
        void test_3() {
            // prepare
            TreeNode root = new TreeNode(1, null, null);

            // when
            List<Integer> result = solution.inorderTraversal(root);
            List<Integer> expected = List.of(1);

            // then
            assertEquals(expected, result);
        }
    }
}