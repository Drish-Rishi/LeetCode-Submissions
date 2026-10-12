package Arrays;


    //Approach: Brute force
    // T.C: O(n)
    // A.S: O(1)

    class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        int ans = 0;
        sum1 = sumOfNum(nums.length);
        sum2 = sumOfArr(nums);
        ans = sum1 - sum2;
        return ans;
    }
    static int sumOfNum(int n){         //Sum of N numbers.
        int sum1 = 0;
        for(int i = 0; i <= n;i++){
            sum1 = sum1 + i;
        }
        return sum1;
    }
    static int sumOfArr(int[] nums){
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){  //sum of given array element
                sum2 = sum2 + nums[i];
        }
        return sum2;
    }
    
}
    

