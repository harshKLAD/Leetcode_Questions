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
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>(); 
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        postOrder(root1, list1);
        
        postOrder(root2, list2);
        
        if(list1.size() != list2.size()){
            return false;
        }
        
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        
    return true;
    }
    
    
    public boolean postOrder(TreeNode root, List list) {
        if (root == null) {
            return false;
        } else {
            boolean left = postOrder(root.left, list);
            boolean right = postOrder(root.right, list);
            
            if(left == false && right == false){
                list.add(root.val);
                //System.out.println(root.val);
            }
            
            return true;
        }
    }
}