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

        ListNode Dummy1 = new ListNode(0);   
        ListNode Dummy2 = new ListNode(0);  
        ListNode TailDummy1 = Dummy1;
        ListNode TailDummy2 = Dummy2; 

        while (head != null){
            if (head.val < x){
                TailDummy1.next = head;
                TailDummy1 = TailDummy1.next;
            }else{
                TailDummy2.next = head;
                TailDummy2 = TailDummy2.next;
            }
            head = head.next;
        }

        TailDummy1.next = Dummy2.next;
        TailDummy2.next = null;
        head = Dummy1.next;
        return head;
    }
}