package Strings;

    // Appraoch : Brute Force
    // T.C : O(n)
    // A.S : O(n)


class Solution {
    public int firstUniqChar(String s) {
        
        int [] freq = new int [26];

        for(int i = 0; i < s.length(); i++){
          //  char ch = s.charAt(i);
            freq[s.charAt(i) - 'a']++;

        }
        for(int j = 0; j < s.length(); j++){
            if(freq[s.charAt(j) - 'a'] == 1){
                return j;
            }

        }
        return -1;
    
    }
}
