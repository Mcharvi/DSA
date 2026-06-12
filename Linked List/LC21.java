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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode list3 = new ListNode(-1);
        int len1 = 0;
        int len2 = 0;
        ListNode curr = list3;
        t1 = list1;
         t2 = list2;

         while(t1!=null &&t2!=null){
            if(t1.val>t2.val){
                     curr.next = new ListNode(t2.val);
                     t2 =t2.next;
                        }
            else{
                    curr.next = new ListNode(t1.val);
                     t1=t1.next;
                    }
            curr = curr.next;                      
            
            }       


        while(t1!=null){
            curr.next = new ListNode(t1.val);
            curr=curr.next;
            t1=t1.next;
            }
        while(t2!=null){
            curr.next = new ListNode(t2.val);
            curr=curr.next;
            t2=t2.next;
            }
        return list3.next;


         }

         }             
    
