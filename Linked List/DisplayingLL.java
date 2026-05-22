public class DisplayingLL {

    /* first node = head, should always be available to print LL
      next.next.next not a good approach, rather ->for loop
      shallow copy of node-> temp is used to traverse LL
       */

    public static void print(Node head){

        Node temp = head;
         // shallow copy of a, address of a and temp will be same. instead, had we created a new node both addresses wouldve been diff, they wouldve been treated like 2 diff nodes.
        /* to traverse -> print temp value then take temp to the next node*/
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;

        }

    }

    public static void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
                System.out.println(head.val);

                //for rev order

        
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        // a.next = b; // linking ( next is defined in Node class)
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //print(a);
        displayRec(a);

        
    }

}

