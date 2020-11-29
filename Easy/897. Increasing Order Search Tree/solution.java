/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    List<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {

        inOrder(root);

        TreeNode current = new TreeNode(list.get(0));
        TreeNode head = current;

        for (int i = 1; i < list.size(); i++) {
            current.right = new TreeNode(list.get(i));
            current = current.right;
        }
        return head;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}