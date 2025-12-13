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
        ListNode Dummy1 = new ListNode(0);   
        ListNode Dummy2 = new ListNode(0);  
        ListNode TailDummy1 = Dummy1;
        ListNode TailDummy2 = Dummy2; 
        int num =1;

        while (head!= null){
            if (num % 2 == 0){
                TailDummy1.next = head;
                TailDummy1= TailDummy1.next;
            }else{
                TailDummy2.next = head;
                TailDummy2= TailDummy2.next;
            }
            head = head.next;
            num++;
        }
        TailDummy2.next = Dummy1.next;
        TailDummy1.next = null;
        return Dummy2.next;
    }
}