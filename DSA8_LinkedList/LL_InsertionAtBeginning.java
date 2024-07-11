package DSA8_LinkedList;
public class LL_InsertionAtBeginning {
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
    public static void main(String[] args) {
        LL_InsertionAtBeginning ll = new LL_InsertionAtBeginning();
        ll.insertAtTheEnd(2);
        ll.insertAtTheEnd(4);
        ll.insertAtTheEnd(6);
        ll.insertAtTheEnd(8);
        ll.displayLL();
        ll.insertAtBeginning(10);
        ll.displayLL();
    }
}
