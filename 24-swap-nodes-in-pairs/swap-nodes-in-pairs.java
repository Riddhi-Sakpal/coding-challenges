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
    public ListNode swapPairs(ListNode head) {
        ListNode Dummy = new ListNode(0);
        Dummy.next = head;
        ListNode pre = Dummy;
        ListNode first = head;

        while (first != null && first.next!=null){
            ListNode second = first.next;
            pre.next= second;
            first.next = second.next;
            second.next =first;

            pre = first;
            first = first.next;
        }

        return Dummy.next;
    }
}