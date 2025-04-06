package linkedList;

import static linkedList.ReverseLinkedList.intialisedListNode;
import static linkedList.ReverseLinkedList.printList;

public class PartitionList {

    public static ListNode partition(ListNode head, int x) {

        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode less = lessHead;
        ListNode great = greaterHead;

        while (head!=null){

            if(head.val<x){
                less.next = head;
                less = less.next;
            }
            else{
                great.next = head;
                great = great.next;
            }
            head = head.next;
        }
        great.next=null;
        less.next = greaterHead.next;


        return lessHead.next;
    }
    public static void main(String[] args) {
        int[] nums ={1,4,3,2,5,2};
        ListNode l = intialisedListNode(nums);
        printList(l);
        l= partition(l,3);

        printList(l);

    }
}
