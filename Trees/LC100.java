public class LC100 {
    



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

    public static int size(TreeNode root){

        if(root==null) return 0;

        int size = 1 + size(root.right) + size(root.left);

        return size;
    }

   
    public boolean isSameTree(TreeNode p, TreeNode q) {



        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }


        if(size(p)!=size(q)){
            return false;
        }
        
        if(p.val!=q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  

   



        }

        
    }
