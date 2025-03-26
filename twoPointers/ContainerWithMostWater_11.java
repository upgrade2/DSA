package twoPointers;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {

        int result=0;
        int left=0,right=height.length-1;
        while (left<right) {

            int area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(area, result);

            if(height[left]<height[right])left++;
            else right--;
        }
        return result;
    }
    public static void main(String[] args) {
        ContainerWithMostWater_11 obj = new ContainerWithMostWater_11();

        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println("Result : "+obj.maxArea(height));
    }
}
