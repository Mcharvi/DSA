class Node{

    int val; //khudka
    Node next; //agle NODE ki info therefore datatype is node

    Node(int val){

        this.val = val;
    }



   
}

public class ListNodeClass{
    public static void main(String[]args){
       
    Node a = new Node (10);
    Node b = new Node (20);
    a.next = b; //linking ( next is defined in Node class)

    /*Node c  = new Node (30);
    Node d = new Node (40);
    Node e = new Node (50);*/
    System.out.println(a);


    }

}