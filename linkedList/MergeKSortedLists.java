package linkedList;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for(ListNode list:lists){
            if(list!=null)minHeap.offer(list);
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            temp.next = node;
            temp = temp.next;

            node = node.next;
            if(node!=null)minHeap.offer(node);
        }
    return dummyNode.next;
    }
}
