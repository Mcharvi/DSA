public class SumOfTreeNodes {


        public static int sum(TreeNode root){

        if(root == null) return 0;
        return (root.val + sum(root.right) + sum(root.left));
    }
}
