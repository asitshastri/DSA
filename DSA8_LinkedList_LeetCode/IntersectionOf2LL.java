/**Reverse Linked List II
 * Leet code Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOf2LL {
    public class ListNode{
        int data;
        ListNode next;
        ListNode(int x){
            data = x;
            next = null;
        }
    }
    //Calculating length of Linked List     
    public int lengthOfLL(ListNode head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count ++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = lengthOfLL(headA); //length of List A
        int lb = lengthOfLL(headB); //length of list B

        ListNode currA = null;
        ListNode currB = null;

        int diff = 0; //diffrernce in length b/w listA and listB
        if(la>lb){
            currA = headA; //current pointer a points to bigger list always i.e A in this case.
            currB = headB;
            diff = la-lb;
        }
        else{
            currA = headB; //current pointer a points to bigger list always i.e B in this case.
            currB = headA;
            diff = lb-la;
        }
        
        //now boosting starting point of longer list by diff
        while(diff!=0){
            currA = currA.next;
            diff--;
        }

        //now catching intersection
        while(currA!=null && currB!=null){
            if(currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
}

