package hashTable;

public class SplitArrayConsecutiveSequence {
    public boolean isPossible(int[] nums) {
        int i=1;
        while(i<nums.length){
            if(nums[i]-nums[i-1]==1){

            }

            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,3,4,5};
        System.out.println(new SplitArrayConsecutiveSequence().isPossible(nums));
    }
}
