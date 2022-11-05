/**
 * Created by Swati Tewari on 11/2/2022
 */
public class LinkedListInsertion {

    static Node headNode = null;

    static class Node {
        public int data;
        public Node next;

        // inserting the required data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating Nodes.......");
        //createNode();
        //printNodes();
        insert_node(1,5);
        insert_node(2,36);
        insert_node(3,11);
        System.out.println("*****************************");
        printNodes();
    }

    /**
     * This method takes an input element and adds that to beginning of a Linked List.
     * @param data - integer element
     */
    static void insertAtBeginning(int data) {
        //First create the new node.
        Node new_node = new Node(1);
        //Next pointer of new node points to the initial head.
        new_node.next = headNode;
        //new head will be the new node.
        headNode = new_node;
    }

    /**
     * This method takes an input element and adds that to the end of the linked List.
     * @param data
     */
    static void insertAtEnd(int data) {
        Node new_node = new Node(data);
        Node temp = headNode;
        while(temp!=null){
            temp = temp.next;
        }
        new_node.next = temp;
        temp = new_node;
    }

    static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        //Iterate and reach position-1 of the Linked List.
        if(headNode==null)
            headNode = new Node(value);
        if(position ==1){
            //First create the new node.
            Node new_node = new Node(1);
            //Next pointer of new node points to the initial head.
            new_node.next = headNode;
            //new head will be the new node.
            headNode = new_node;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    // adding Node at required position
                    Node newNode = new Node(value);

                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.next = headNode.next;

                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
        }
    }



        /*//This method will add elements to linked list
    static void createNode() {
        head = new Node(2);
        tail = head;
        for (int i = 3; i <= 5; i++) {
            tail.next = new Node(i);
            tail = tail.next;
        }
    }*/

    static void printNodes(){
        Node temp = headNode;
        int count = 0;
        while (temp != null) { //avoid the Null pointer exception for head is null.
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
