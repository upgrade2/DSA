package linkedList;

import static linkedList.ReverseLinkedList.intialisedListNode;
import static linkedList.ReverseLinkedList.printList;

public class RemoveDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
            dummy.next=head;

        ListNode prev=dummy;
        ListNode curr = head;
        while (curr!=null){
            if(curr.next!=null&&curr.val == curr.next.val){
                    while (curr.next!=null && curr.val==curr.next.val){
                        curr = curr.next;
                    }
                    prev.next = curr.next;
            }
            else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,3,4,4,5};
        ListNode head = intialisedListNode(nums);
        printList(head);

        head = deleteDuplicates(head);

        printList(head);
    }
}
