/* baar baar nodes bana ke connect karna is too much-> automate it.

create a class:
class LinkedList{

have variable head,tail,size (optional for now)

ll.add(50) should add 50 at end and shift tail to 50 asw
ll.addHead(40) should add 40 at front and shift head to 40 automatically

NO SHIFTING!!

we need node class (alr defined in other files)

we treat the class LinkedList as an object

}

*/
class SLL { // user defined data structure

    private Node head;
    private Node tail;
    int size;
    // if LL is empty->
    void insertEnd(int val) {

        Node temp = new Node(val);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;

        }
    }

    void insertBeg(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;

        } else {

            temp.next = head;
            head = temp;

        }
        size++;
    }

    void insertAnywhere(int idx, int val) {

        Node temp = new Node(val);
        Node x = head;

        if (idx == 0) {
            temp.next = head;
            head = temp;
            size++;
            return;

        } else if (idx == size) {
            tail.next = temp;
            tail = temp;
            size++;
            return;
        } else if (idx > size) {
            System.out.println("invalid");
            return;
        } else {
            for (int i = 0; i < idx - 1; i++) {
                x = x.next;
            }
            // insertion
            temp.next = x.next;
            x.next = temp;
            size++;
            
        }
    }

    void getElement(int idx){
        if(idx == size-1){
            System.out.println(tail.val);
            return;
        }
        else if(idx>=size || idx < 0){
            System.out.println("invalid");
            return;
        }
        else if (idx == 0){
            System.out.println(head.val);
            return;
        }
        else{

        //return the element at any given index
        Node temp = head;
        for(int i=0; i<=idx-1; i++){
            temp = temp.next;

        }
        System.out.println(temp.val);
    }
        
}

    //deletion in linked list

    void deleteAtHead(){

        if(head==null){
            System.out.println("list is empty");

        }
        else{
            head = head.next;
            size--;
        }

    }

    void deleteAtTail(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;

    }
}

public class ImplementationLLClass {
    public static void main(String[] args) {

        SLL list = new SLL();
        System.out.println();
        list.insertEnd(10);
        list.insertEnd(20);
        // list.display();
        list.insertEnd(30);
        // list.display();
        list.insertBeg(500);
        list.insertAnywhere(2, 100);
        //System.out.println(list.size);
        list.insertAnywhere(0,8000);
        list.getElement(2);
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
    }
}

