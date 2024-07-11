package DSA8_LinkedList;
/**
 * LinkedList
 */

public class LL_InsertionAtEnd {
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
    public static void main(String[] args) {
        LL_InsertionAtEnd llist = new LL_InsertionAtEnd();
        llist.insertAtTheEnd(2);
        llist.insertAtTheEnd(4);
        llist.insertAtTheEnd(6);
        llist.insertAtTheEnd(8);
        llist.displayLL();
    }
}