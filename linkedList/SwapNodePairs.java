package linkedList;

import static linkedList.PalindromeLinkedList.intialisedListNode;
import static linkedList.ReverseLinkedList.printList;

public class SwapNodePairs {
    public static ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next!=null && curr.next.next!=null){
        ListNode firstNode = curr.next;
        ListNode secondNode = curr.next.next;

        firstNode.next = secondNode.next;
        curr.next = secondNode;
        secondNode.next = firstNode;

        curr =firstNode;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        ListNode l = intialisedListNode(nums);
        printList(l);
        l = swapPairs(l);
        printList(l);
    }
}
