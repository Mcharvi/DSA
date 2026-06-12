import java.util.*;
public class LC142 {
    



 class ListNode {
   int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

    public ListNode detectCycle(ListNode head) {
         HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }
        return null;
        
    }
}
