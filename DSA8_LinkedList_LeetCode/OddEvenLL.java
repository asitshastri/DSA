/*328. Odd Even Linked List
 * Link: https://leetcode.com/problems/odd-even-linked-list/description/
 */

import DSPacks.LeetCodeLL.ListNode;

public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode odd =head;
        ListNode oddhead = head;
        ListNode evenhead = head.next;
        ListNode even = head.next;
        
    
        while(odd!=null && odd.next!=null && even!=null && even.next!=null){
            odd.next = even.next;     // Connect current odd node to the next odd node
            odd = odd.next;           // Move odd pointer forward
            even.next = odd.next;     // Connect current even node to the next even node
            even = even.next;         // Move even pointer forward
        }
        odd.next = evenhead;
        return head;
        }
}
