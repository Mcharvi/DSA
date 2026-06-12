public class LC328 {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        ListNode temp = head;
        ListNode odd = new ListNode (-1);
        ListNode even = new ListNode(-1);
        ListNode o = odd;
        ListNode e = even;

        while(temp!=null){

            o.next = temp;
            o=o.next;
            temp = temp.next;

            if(temp!=null){
            e.next = temp;
            e=e.next;   
            temp = temp.next;

        }
        }

        //merge

        e.next = null;
        o.next = even.next;
        return odd.next;

        
    }
}