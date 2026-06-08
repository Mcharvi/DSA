public class LC543Optimized {
    

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


   
    public int levels(TreeNode root, int []maxDia){
        if(root==null){ return 0; }
        int rightLevels = levels(root.right,maxDia);
        int leftLevels = levels(root.left,maxDia);
        int myDia = rightLevels+leftLevels;
         maxDia[0] = Math.max(myDia, maxDia[0]);
        return 1+Math.max(leftLevels,rightLevels);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        int [] maxDia ={0};
        levels(root,maxDia);
        return maxDia[0];
    }
}