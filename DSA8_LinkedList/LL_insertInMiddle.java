package DSA8_LinkedList;

public class LL_insertInMiddle {
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
    public static void main(String[] args) {
        LL_insertInMiddle llist = new LL_insertInMiddle();
        llist.insertAtTheEnd(2);
        llist.insertAtTheEnd(4);
        llist.insertAtTheEnd(6);
        llist.insertAtTheEnd(8);
        llist.displayLL();
        llist.insertAfter(llist.head.next.next, 10);
        llist.displayLL();
    }
}
