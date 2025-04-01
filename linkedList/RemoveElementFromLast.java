package linkedList;

import static linkedList.ReverseLinkedList.intialisedListNode;
import static linkedList.ReverseLinkedList.printList;

public class RemoveElementFromLast {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode slow = dummy,fast= dummy;
        for(int i =0; i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};

        ListNode head = intialisedListNode(nums);

        printList(head);

        head=removeNthFromEnd(head,4);

        printList(head);
    }

}
