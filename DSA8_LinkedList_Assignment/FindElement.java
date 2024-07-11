package DSA8_LinkedList_Assignment;

public class FindElement {
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

    //Finding Element x from linked list
    public void findX(int d){
        Node curr = head;
        int flag = 0;
        while(curr!=null){
            if(curr.data==d){
                flag=1;
                break;
            }
            curr = curr.next;
        }
        if(flag==0){
            System.out.println(d+" is not present inside Linked List");
        }
        else{
            System.out.println(d+" is present inside Linked List");
        }
    }
    public static void main(String[] args) {
        FindElement llist = new FindElement();
        llist.insertAtEnd(10);
        llist.insertAtEnd(1);
        llist.insertAtEnd(5);
        llist.displayLL();

        //finding element:
        llist.findX(1);
    }
}
