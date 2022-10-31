/**
 * Created by Swati Tewari on 10/28/2022
 */
public class CreateLinkedList {

    static class Node {
        int data;
        Node next;

        // constructor to create new node
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Initially both head and tail are not
        // pointing to any other node
        Node head = null;
        Node tail = null;
        head = new Node(1);
        tail = head;

        for(int i=2;i<=4;i++){
            tail.next=new Node(i);
            tail = tail.next;
        }
        length(head);

    }

    //get the size of a linked list
    public static int length(Node head) {

        Node temp = head;
        int count = 0;
        while (temp != null) { //avoid the Null pointer exception for head is null.
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }

}
