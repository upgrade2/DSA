package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senetor {
    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> rIdx = new LinkedList<>();
        Queue<Integer> dIdx = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                rIdx.add(i);
            }
            else {
                dIdx.add(i);
            }
        }
        while (!rIdx.isEmpty()&&!dIdx.isEmpty()){
            int i = rIdx.poll();
            int j = dIdx.poll();
            if(i<j){
                rIdx.add(i+n);
            }else {
                dIdx.add(i+n);
            }

        }
        return rIdx.isEmpty()? "Dire":"Radiant";
    }

    public static void main(String[] args) {

        System.out.println(" Result :"+predictPartyVictory("RD"));
    }
}
