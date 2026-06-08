import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC102 {

    static int n;
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b;
        a.right = c;
        b.left =d;
        b.right=e;
        c.left = f;
        c.right = g;
        e.left =h;
        f.right =i;

        LevelOrder(a);
    }


    private static void nThLevel(TreeNode root, int level, List<Integer>arr){
        if(root==null) return;
        if(level == n){
            arr.add(root.val);
            return;}
        nThLevel(root.left, level+1,arr);
        nThLevel(root.right, level+1,arr);
    }

    public static List<List<Integer>> LevelOrder(TreeNode root){

        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i =0; i<lvl; i++){
            n=i;
            List<Integer> arr = new ArrayList<>();
            nThLevel(root,0,arr);
            ans.add(arr);
        }
        return ans;
    }

    private static int levels(TreeNode root){
        //to find number of levels
        if(root == null)return 0;
        return 1+ Math.max(levels(root.left), levels(root.right));

    }

    
    
}

