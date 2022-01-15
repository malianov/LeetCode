package solutions.task637averageoflevelsinbinarytree;

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
    public List<Double> averageOfLevels(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> storage = new ArrayDeque<>();
        storage.add(root);

        while (!storage.isEmpty()) {
            double total = 0d;
            int size = storage.size();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = storage.remove();
                total += currentNode.val;

                if (currentNode.right != null) {
                    storage.add(currentNode.right);
                }

                if (currentNode.left != null) {
                    storage.add(currentNode.left);
                }
            }
            averages.add(total / size);
        }
        return averages;
    }
}
