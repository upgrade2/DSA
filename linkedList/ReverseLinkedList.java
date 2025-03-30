package linkedList;

import java.util.Iterator;

public class ReverseLinkedList {

public static ListNode reverseList(ListNode head){

    ListNode prev = null;
    while (head != null) {
        ListNode nextNode = head.next;
        head.next = prev;
        prev = head;
        head = nextNode;
    }
    return prev;
}
    public static void printList(ListNode head){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};

        ListNode l = intialisedListNode(nums);

        printList(l);

       l=reverseList(l);

        printList(l);
    }

    public  static ListNode intialisedListNode(int[] nums){
        if(nums.length==0)return null;
        ListNode head = new ListNode(nums[0]);
        ListNode currentNode = head;
        for(int i=1;i<nums.length;i++){
            currentNode.next=new ListNode(nums[i]);
            currentNode = currentNode.next;
        }
        return head;
    }
}
