package linkedList;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head){

        List<Integer> list = new ArrayList<>();

        ListNode currentNode = head;
        while(currentNode!=null){
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }
        int i=0,j= list.size()-1;
        while (i<j){
            if(list.get(i) !=list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        ListNode l = intialisedListNode(nums);

        System.out.println("Result:"+isPalindrome(l));
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