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

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int excess = 0;    
        int sum = ((l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + excess) ;
        excess = sum / 10;
        ListNode output = new ListNode(sum % 10);
        ListNode iter = output;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
        while(l1!=null || l2 !=null){
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + excess;
            excess = sum / 10;
            iter.next = new ListNode(sum % 10);
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
            iter = iter.next;
        }
        if(excess != 0 ){
            iter.next = new ListNode(excess);
        }
        return output;
        

    }
}