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
        while(current.next != null){
            if(current == odd){
                odd.next = even.next;
            }
            if(current == even){
                even.next = odd.next;
            }
            current = current.next;
        }
        return head;
    }
}