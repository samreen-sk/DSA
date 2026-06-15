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
    public ListNode deleteMiddle(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==1) return null;
        ListNode fast = head;
        ListNode slow = head;
        if(c%2==0){
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast = fast.next.next;
            }
            slow.next=slow.next.next;
        }
        else{
            temp = null;
            while(fast.next!=null && fast.next.next!=null){
                temp = slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}