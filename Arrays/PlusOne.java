package Arrays;

        //Approach: Digit-by-digit carry
        //Time Complexity: O(n)
        //Auxiliary space: O(n)

public class PlusOne {
    
    public int[] plusOne(int[] digits) {

       int [] ar = new int[digits.length + 1];
        for(int i = digits.length - 1; i >= 0; i--){
                if(digits[i] < 9){
                    digits[i] = digits[i] + 1;
                    return digits;
                }   
                else if(digits[i] == 9){
                   digits[i] = 0;
                }
        }
        ar[0] = 1;
        return ar;
    }

}
