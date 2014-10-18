package remove.duplicates.from.sorted.list;

import leetcode.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node!=null){
            ListNode next = node.next;
            if(next!=null){
                if(node.val == next.val){
                    node.next = next.next;
                }else{
                    node = next;
                }
            }else{
                node = next;
            }
        }

        return head;
    }
}
