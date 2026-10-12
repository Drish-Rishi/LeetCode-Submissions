package Arrays;

        // Approach: Optimized (using edge case num <= 1, i * i <= num)
        // T.C: O(n)
        // A.S: O(sqrt n)
class Solution {
    public boolean checkPrime(int num) {
        //your code goes here
        if(num <= 1){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}