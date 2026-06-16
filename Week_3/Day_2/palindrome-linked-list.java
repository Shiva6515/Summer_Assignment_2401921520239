class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode secondHalf = prev;
        //ListNode firstHalf = head;
        while(secondHalf!=null){
            if(secondHalf.val!=head.val) return false;
            secondHalf = secondHalf.next;
            head = head.next;
        }
        return true;
    }
}