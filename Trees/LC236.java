import java.util.*;
public class LC236 {
    

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

    public boolean path(TreeNode root, TreeNode target, List<TreeNode>ans){
        if (root == null) return false;

        ans.add(root);

        if(root == target){
            return true;
        }
        if(path(root.left,target,ans) || path(root.right,target,ans)){
            return true;
        }

        ans.remove(ans.size()-1);
        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        TreeNode ans = null;

        path(root, p,pathP);
        path(root,q,pathQ);

        int i =0;
        while(i< pathP.size() && i<pathQ.size()){

            if(pathP.get(i) == pathQ.get(i)){

                ans = pathP.get(i);
            }
            else{
                break;
            }

            i++;
        }

        return ans; 
        
    }
}