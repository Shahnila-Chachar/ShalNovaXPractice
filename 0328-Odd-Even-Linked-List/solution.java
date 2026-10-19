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
        ListNode current = head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        if(head == null){
            return null;
        }
        while(even != null){
            odd.next = even.next;
            odd=odd.next;
            even.next = odd.next;
            even = even.next;
        }
        return head;
    }
}