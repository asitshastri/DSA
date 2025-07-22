/* 237. Delete Node in a Linked List
 * Link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 * NO head given
 * Solution:-
 *      1) swap value with next node ---> change current node next pointer to next.next
 *              Disadvantage: node does not gets collected by garbage collector
 *      2) swap value with next node ---> change next node next to null so it gets collected by garbage collector.
 */

import DSPacks.LeetCodeLL.ListNode;;

public class DeleNode237 {
    public void deleteNode(ListNode node){
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;

        node.next = node.next.next;
    }
}
