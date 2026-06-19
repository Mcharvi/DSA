import javax.swing.tree.TreeNode;

public class LC98 {

    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;
        if(root.val>min(root.right)) return false;
        if(root.val<max(root.left)) return false;
        return isValidBST(root.left) && isValidBST(root.right);          


        }
        
    

    public int max(TreeNode root){

        if(root == null) return INTEGER.MIN_VALUE;
        int a = root.val, b = max(root.left) , c= max(root.right);
        return Math.max(a,Mth.max(b,c));
    }

    public int min(TreeNode root){
       

         if(root == null) return INTEGER.MAX_VALUE;
        int a = root.val, b = min(root.left) , c= min(root.right);
        return Math.min(a,Math.min(b,c));
    }

    
    
}
