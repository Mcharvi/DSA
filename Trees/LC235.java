public class LC235 {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){

        if(root.val<p && root.val<q) return lowestCommonAncestor(root.right,p,q );
        else if(root.val>q && root.val >p) return lowestCommonAncestor(root.left,p,q);
        else return root;
    }
    
}
