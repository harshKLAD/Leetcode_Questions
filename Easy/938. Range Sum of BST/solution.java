/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {

        postOrder(root, low, high);

        return sum;
    }

    public void postOrder(TreeNode root, int low, int high) {

        if (root == null) {
            return;
        } else {
            if (root.val > low) {
                postOrder(root.left, low, high);
            }
            if (root.val < high) {
                postOrder(root.right, low, high);
            }

            if (low <= root.val && root.val <= high) {
                sum = sum + root.val;
            }

        }

    }
}