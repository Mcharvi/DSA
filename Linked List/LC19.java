public class LC19 {
    

 class ListNode {
   int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len =0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        temp = head; 

        if(n==len){
            return head.next;
            }
        for(int i =1; i<len-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;



        
    }
}
