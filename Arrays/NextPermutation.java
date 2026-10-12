package Arrays;

    // Approach: Brute force (Handling the edge cases)
    // T.C : O(n)
    // A.S : (1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // 1) Find breakpoint

       for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                 ind = i;
                    break;
            }
       }
            // Edge Case
                if(ind == -1){
                    reverse(nums,0,n - 1);
                    return;
                }
       
       
       // 2) Find element just greater than arr[ind]

        for(int i = n - 1; i >= ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];  // swap
                nums[ind] = temp;

                break;
            }
        }

        // 3) Reverse the remaing part
        reverse (nums,ind + 1, n - 1);
    }
     // 4) Reverse method define (helper)

     public void reverse(int [] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

                left++;
                right--;
        }
     }
}
