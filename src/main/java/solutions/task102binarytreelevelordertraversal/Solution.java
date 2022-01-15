package solutions.task102binarytreelevelordertraversal;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();

        Queue<TreeNode> currentLevelOfNodes = new ArrayDeque<>();
        currentLevelOfNodes.add(root);

        List<Integer> currentLevelOfElements = new ArrayList<>();
        currentLevelOfElements.add(root.val);

        while (!currentLevelOfNodes.isEmpty()) {
            list.add(currentLevelOfElements);

            Queue<TreeNode> previousLevelOfNodes = currentLevelOfNodes;

            currentLevelOfNodes = new ArrayDeque<>();
            currentLevelOfElements = new ArrayList<>();

            for (TreeNode parent : previousLevelOfNodes) {
                if (parent.left != null) {
                    currentLevelOfNodes.add(parent.left);
                    currentLevelOfElements.add(parent.left.val);
                }

                if (parent.right != null) {
                    currentLevelOfNodes.add(parent.right);
                    currentLevelOfElements.add(parent.right.val);
                }
            }
        }
        return list;
    }
}
