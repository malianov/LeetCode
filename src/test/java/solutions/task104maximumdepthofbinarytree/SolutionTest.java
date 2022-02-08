package solutions.task104maximumdepthofbinarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Task 104. Maximum Depth of Binary Tree")
class SolutionTest {

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
        int expected = 3;

        // when
        int result = solution.maxDepth(root);

        // then
        assertEquals(expected, result);
    }

    @DisplayName("Test 2")
    @Test
    void test_2() {
        // prepare
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, null));
        int expected = 2;

        // when
        int result = solution.maxDepth(root);

        // then
        assertEquals(expected, result);
    }
}