package monotanicStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int result[] =new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i:nums2){
            while(!stack.empty()&&stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }

        for(int i=0;i<nums1.length;i++){
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
    public static int[] nextGreaterElement(int[] nums1) {
        int result[] =new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums1.length-1;i>=0;i--){
            while(!stack.empty()&&stack.peek()<nums1[i]){
                stack.pop();
            }
            if(stack.empty()){
                result[i]=-1;
            }
            else {
                result[i]=stack.peek();
            }
            stack.push(nums1[i]);
        }

        return result;
    }


    public static void main(String[] args) {
      //  int[] nums2 ={6,8,0,1,3,6,7,5};
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        System.out.println("\n-----NGE Normal Concept------------");
        for(int i:nums2){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:nextGreaterElement(nums2)){
            System.out.print(i+" ");
        }


        System.out.println("\n\n-----Following Solved Using HashMap------------");
        for(int i:nextGreaterElement(nums1,nums2)){
            System.out.print(i+" ");
        }

    }
}