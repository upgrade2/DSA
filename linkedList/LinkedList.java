package linkedList;
public class LinkedList {

    public Node convertToLinkedList(int[] input){
        if(input==null || input.length==0)return null;
        Node head = new Node(input[0]);
        Node current = head;
        for(int i=1;i<input.length;i++){
        Node newNode = new Node(input[i]);
        current.next = newNode;
        current = newNode;
        }
        return head;
    }

    public void printLinkedList(Node head){
        System.out.print("\n head : ");
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.print(head);
    }

    //Delete
    //1. Head
    private Node deleteHead(Node head){
    if(head==null) return head;
    head = head.next;
    return head;
    }

    //2. Tail
    private Node deleteTail(Node head){
        if(head==null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    //3. Delete kth element position.
    private Node deleteKthElement(Node head,int k){
        if(head==null) return head;
        Node temp = head , prev=null;
        int count=0;
        if(k==1){
            return head.next;
        }
        while(temp!=null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private Node deleteElementByValue(Node head, int value){
        if(head==null) return head;
        if(head.val==value)return head.next;

        Node temp = head,prev=null;
        while (temp!=null){
            if(temp.val == value){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    LinkedList obj = new LinkedList();
    Node head = obj.convertToLinkedList(arr);
    //head= obj.deleteHead(head); // Deletion from HEAD.
    //obj.deleteTail(head);       // Deletion from TAIL.
    // obj.deleteKthElement(head,2); // Deletion by kth position
    //obj.deleteElementByValue(head,2); // Deletion by element value



obj.printLinkedList(head);
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }
}
