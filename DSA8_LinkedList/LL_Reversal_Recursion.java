package DSA8_LinkedList;

public class LL_Reversal_Recursion {
    //initializing head
    Node head;
    //creating a Node class 
    class Node{
        int data;
        Node next; //next pointer

        //defiding constructor: if data d is inserted inside the node then
        Node(int d){
            data = d;
            next = null;
        }
    }
    //Implementation of insertion of a node at the end
    public void insertAtTheEnd(int newData){
        // creating new node for newData
        Node newNode = new Node(newData);

        //check weather linked list is empty or not
        if(head==null){
            head = new Node(newData);
            return;
        }

        //linked list is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //function to display linkedlist
    public void displayLL(){
        Node current = head;
        System.out.print("[ ");
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print("]\n");
    }

    //Insertion at the beginning
    public void insertAtBeginning(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }
    //Inserting after any Node in LinkedList
    public void insertAfter(Node previousNode,int newData){
        if(previousNode==null){
            System.out.println("Previous node can't contain null value");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    //Deletion
    public void deleteFrom(int position){
       //Empty LinkedList
       if(head==null){
           return;
       }

       Node temp = head;
       //deletion in the beginning of the list
       if (position==0){
           head = temp.next;
       }
       //deletion is not in the begining og the node
       for(int i=0;temp!=null && i<position-1;i++){
           temp = temp.next;
       }
       if(temp==null ){
           return;
       }
       temp.next = temp.next.next;
    }

    //reversal of Linked List
    public void reverseLL(){
       //creating 3 different pointers
       Node curr = head;
       Node prev = null;
       Node nextptr = null;

       while (curr!=null) {
           nextptr = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextptr;
       }
       head = prev;
    }

    //Reversal using Recurssion
    public void reverseRec(Node curr,Node prev){
        if(curr.next==null){
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextptr = curr.next;
        curr.next=prev;
        reverseRec(nextptr, curr);
    }

    public static void main(String[] args) {
        LL_Reversal_Recursion llist = new LL_Reversal_Recursion();
        llist.insertAtTheEnd(2);
        llist.insertAtTheEnd(4);
        llist.insertAtTheEnd(6);
        llist.insertAtTheEnd(8);
        llist.displayLL();
        llist.reverseRec(llist.head, null);
        llist.displayLL();

    }
}
