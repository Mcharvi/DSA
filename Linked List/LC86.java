public class LC86 {
    
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
    public ListNode partition(ListNode head, int x) {

        ListNode temp = head;
        
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode (-1);
        ListNode s = small;
        ListNode b = big;

        while(temp!=null){

            if(temp.val < x){
                s.next = temp;
                s = s.next;
                
            }
            else{
                b.next = temp;
                b = b.next;            }
            temp=temp.next;
        }

        b.next = null;
        s.next = big.next;
        return small.next;       
        
    }
}