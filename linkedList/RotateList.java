package linkedList;

import static linkedList.ReverseLinkedList.intialisedListNode;
import static linkedList.ReverseLinkedList.printList;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0) return head;
        ListNode tail = head;

        int length=1;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }

        tail.next=head;

        k=k%length;

        int breakpoint = length-k;
        ListNode newTail = tail;

        while (breakpoint-- >0){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next=null;

        return newHead;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};

        ListNode l = intialisedListNode(nums);

        printList(l);

        l = rotateRight(l,2);

        printList(l);
    }
}
