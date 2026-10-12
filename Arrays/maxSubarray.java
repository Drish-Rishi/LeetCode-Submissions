package Arrays;

        //Appraoch - Kadane's Algorithm
        //T.C - O(n)
        // A.S - O(1)
        
class Solution {
    public int maxSubArray(int[] nums) {
        // sum < 0 , sum ki value zero hai max find krna hai to negative to hoga nhi
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            
            sum = sum + nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}