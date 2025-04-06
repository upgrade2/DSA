package linkedList;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static linkedList.ReverseLinkedList.intialisedListNode;

public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head){

        //find the mid-point


        //reverse the list from the half



        //start comparing the element from the half


        return false;
    }

    public static ListNode endOfFirstHalf(ListNode head){



        return  null;
    }



    public static void main(String[] args) {
       // int[] nums = {1,2,2,1};
        int[] nums = {1,2};
        ListNode l = intialisedListNode(nums);

        System.out.println("Result:"+isPalindrome(l));
    }

}