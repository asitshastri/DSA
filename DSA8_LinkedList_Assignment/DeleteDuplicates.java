package DSA8_LinkedList_Assignment;

public class DeleteDuplicates {
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

    //delete Duplicates
    public void delDuplicates(){
        if(head==null || head.next==null){
            return;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return;
    }
    public static void main(String[] args) {
        DeleteDuplicates llist = new DeleteDuplicates();
        llist.insertAtEnd(10);
        llist.insertAtEnd(2);
        llist.insertAtEnd(1);
        llist.insertAtEnd(1);
        llist.insertAtEnd(1);
        llist.insertAtEnd(10);
        llist.displayLL();

        llist.delDuplicates();
        llist.displayLL();

    }
}
