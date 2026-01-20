class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return countCycleLength(slow);
            }
        }
        return 0;
     }
     private int countCycleLength(ListNode node) {
        int length = 1;
        ListNode current = node.next;

        while(current != node) {
            length++;
            current = current.next;
        }
        return length;
     }
 }
