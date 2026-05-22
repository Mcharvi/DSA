public class LC876 {
    public Node middleNode(Node head) {

        Node temp = head;
        double size=0;
            while(temp.next!=null){
                size++;
                temp = temp.next;             }
        double mid = Math.ceil(size/2);
        temp = head;
        for(int i=0; i<mid; i++){
            temp = temp.next;
        }
        return temp; 

        }        
    
}
