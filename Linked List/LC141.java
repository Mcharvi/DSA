import java.util.*;

public class LC141 {
     public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
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

