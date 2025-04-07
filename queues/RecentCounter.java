package queues;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> calls;
    public RecentCounter() {
        calls = new LinkedList<>();
    }

    public int ping(int t) {
        calls.offer(t);
        while(calls.peek()<t-3000){
            calls.poll();
        }
        return calls.size();
    }

    public static void main(String[] args) {


    }

}
