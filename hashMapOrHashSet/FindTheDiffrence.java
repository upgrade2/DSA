package hashMapOrHashSet;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class FindTheDiffrence {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int val:nums1){
            set1.add(val);
        }

        for(int val:nums2){
            set2.add(val);
        }

        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();

        for(int val:nums1){
            if(set2.contains(val)==false)ans1.add(val);
        }
        for(int val:nums2){
            if(set1.contains(val)==false)ans2.add(val);
        }

    return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));
    }
    public static void main(String[] args) {
    int[] nums1={1,2,3};
    int[] nums2={2,4,6};

    FindTheDiffrence obj  = new FindTheDiffrence();

        System.out.println("Result:"+obj.findDifference(nums1,nums2));

    }
}
