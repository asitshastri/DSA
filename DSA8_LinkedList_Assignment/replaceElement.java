package DSA8_LinkedList_Assignment;
/*
Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.
Input : LL = 1 -> 2 -> 4 -> 5 -> 6 pointer = 2 value = 3.
Output : 1 -> 2 -> 3 -> 4 -> 5 -> 6
 */
public class replaceElement {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    //inserting element at the end of the node
    public void insertAtEnd(int data){
        //creating  node to insert at the end
        Node newNode = new Node(data);

        //if linked list is empty
        if(head==null){
            head= newNode;
            return;
        }

        //if linked list is not empty
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    //Displaying Linked list
    public void displayLL(){
        Node temp = head;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    //replace element
    public void replace(int pointer,int d){
        Node curr = head;
        while (pointer>0) {
            curr = curr.next;
            pointer-=1;
        }
        curr.data=d;
    }

    //Insert in middle
    public void insertAtX(int position,int newElement){
        Node newNode = new Node(newElement);
    
        if(position < 1) {
          System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
          newNode.next = head;
          head = newNode;
        } else {
          
          Node temp;
          temp = head;
          for(int i = 1; i < position-1; i++) {
            if(temp != null) {
              temp = temp.next;
            }
          }
       
          if(temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;  
          } else {
            System.out.print("\nThe previous node is null.");
          }       
        }
    }
    public static void main(String[] args) {
        replaceElement llist = new replaceElement();
        llist.insertAtEnd(10);
        llist.insertAtEnd(1);
        llist.insertAtEnd(5);
        llist.displayLL();

        llist.replace(0, 5);
        llist.displayLL();

        llist.insertAtX(1, 2);
        llist.displayLL();

    }
}
