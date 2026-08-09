package linkedList;

public class CopyLinkedListWithRandomPointers {
    // Algo ->
    //1. Create a copy Node In-between of the lists
    //2. Connect the random pointers.
    //3. Connect the next pointers and return the list.
    public Node copyRandomList(Node head) {
        copyListInBetween(head);
        connectTheRandomPtr(head);
        return connectTheNextPointers(head);
    }
    private void copyListInBetween(Node head){
        Node temp = head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next;
        }
    }
    private void connectTheRandomPtr(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            copyNode.random = temp.random.next;
            temp = temp.next.next;
        }
    }
    private Node connectTheNextPointers(Node head){
        Node dummyNode = new Node(-1);
        Node copyNode = dummyNode;
        Node temp = head;

        while(temp != null){
            copyNode.next = temp.next;
            temp.next = temp.next.next;
            copyNode = copyNode.next;
            temp = temp.next;
        }

        return dummyNode.next;
    }

}