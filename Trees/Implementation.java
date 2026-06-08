public class Implementation{


    public static void main(String[] args) {

        TreeNode a = new TreeNode(1); //a is the root 
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e= new TreeNode(6);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(40);



        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left =f; c.right =g;
        d.left = h;

        //display(a);
        //System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(level(a));



        
    }


    public static void display(TreeNode root){

        if(root == null){
            return;
        }
        System.out.print(root.val +" ");
        display(root.right);
        display(root.left);

    }

    public static int sum(TreeNode root){

        if(root == null) return 0;
        return (root.val + sum(root.right) + sum(root.left));
    }

    public static int max(TreeNode root){
        if(root==null) return 0;

        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);

        return Math.max(a, Math.max(b,c));
    }

    public static int size(TreeNode root){

        if(root==null) return 0;

        int size = 1 + size(root.right) + size(root.left);

        return size;
    }

    public static int level(TreeNode root){

        if(root == null) return 0;


        return 1 + Math.max(level(root.right),level(root.left));


    }

}









class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //constructor:

    TreeNode(int val){
        this.val = val;
    }

}
