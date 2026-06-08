import java.util.*;

public class LevelOrderTraversalQueue {

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

        Scanner sc = new Scanner(System.in);

        //System.out.println("Level order: ");
        //levelOrder(a);
        System.out.println();

        System.out.println("Enter n: ");
         n = sc.nextInt();

        /*for(int x=0; x<=3; x++){
            n=x;
            nThLevel(a,0);
            System.out.println();*/

        levOrderQueue(a);
                System.out.println();

        }

    

    private static void levelOrder(TreeNode root){

        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);

        while(q.size()>0){

            TreeNode front = q.remove();

            System.out.print(front.val + " ");

            if(front.left!=null) q.add(front.left);
            if(front.right!=null)q.add(front.right);

        }
    }

    public static class Pair{
        TreeNode node;
        int level;

        Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}

  
    public static void levOrderQueue(TreeNode root){
        int prevlevel =0;

        Queue<Pair>q = new LinkedList<>();
        Pair p = new Pair(root,0);
        if (root!=null) q.add(p);
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            if(lvl!=prevlevel){
                System.out.println();
                prevlevel++;;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));


        }
    }
    private static void nThLevel(TreeNode root, int level){
        if(root == null) return;      
        if(level==n) System.out.print(root.val + " ");
        nThLevel(root.left, level+1);
        nThLevel(root.right, level+1);

    }    

    private static void preorder(TreeNode root){

        if(root==null) return ;
        System.out.println(root.val + " ");
            preorder(root.left);
            preorder (root.right);
        }


    }
    






