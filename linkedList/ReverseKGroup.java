package linkedList;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prevNode=null;
        while(temp!=null){
        ListNode kthNode = getKth(temp,k);
        if(kthNode ==null){
            if(prevNode!=null)prevNode.next=temp;
            break;
        }
       ListNode nextNode = kthNode.next;
        kthNode.next=null;
        reverseList(temp);
        if(temp==head)head=kthNode;
        else prevNode.next=kthNode;

        prevNode=temp;
        temp=nextNode;
        }
        return head;
    }
    private ListNode getKth(ListNode curr,int k){
        k -=1;
        while(curr!=null && k>0){
            k--;
            curr = curr.next;
        }
        return curr;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null , cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
