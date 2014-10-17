package linked.list.cycle;


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode next = head.next;
        if(next != null){
            ListNode next2 = next.next;
            if(next2==null) return false;
            while (next!=next2){
                if(next2==null) return false;
                next = next.next;
                next2 = next2.next;
                if(next2==null){
                    return false;
                }else{
                    next2 = next2.next;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}