package Arrays;

    //Appraoch : Brute force (Calculate newProfit in each iteration)
    //T.C : O(n)
    // A.S : O(1)
    class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int newProfit = 0;
       

        for(int i = 1; i < prices.length; i++){
                if(prices[i] < min ){
                    min = prices[i];
                     
                }
                newProfit = prices[i] - min;

                if(newProfit > profit){
                    profit = newProfit;
                }
                
        }
        return profit;
    }
    
}
    

