public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }return nums;

    }
}
