class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null  || k == 0) return head;

        // Step 1: Find length
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        if (k % length == 0) return head;
        k = k % length;
        tail.next=head;
        ListNode LastNode = findLastNode(length-k,head);
        head = LastNode.next;
        LastNode.next = null;
        return head;

    }
    public ListNode findLastNode(int k, ListNode start){
        int cnt = 0;
        while(start!=null){
            cnt++;
            if(cnt==k){
                return start;
            }
            start=start.next;
        }
        return start;
    }
}