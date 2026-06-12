public class LC19SlowFastPtr {
     public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow =head;
        ListNode fast =head;

      
            for(int i=0; i<n; i++){
                fast =fast.next;
            
        }
        int len = 0;
        ListNode temp =head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(n == len){
            return head.next;
        }

        while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;        
    }
    slow.next = slow.next.next;
    return head;
}
}
 class ListNode {
   int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
