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
    public TreeNode invertTree(TreeNode root) {
        //BFS
        //queue
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return null;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
        
        
        // if(root == null){
        //     return root;
        // }else{
        //     TreeNode temp = root.left;
        //     root.left = root.right;
        //     root.right = temp;

        //     invertTree(root.left);
        //     invertTree(root.right);
        // }
        // return root;
    }
    
}
