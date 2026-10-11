package Recursion;

        //Approach: using recursion
        // T.C: O(2^n)
        // A.S: O(n) due to recursion stack

public class Fibonacci {

    public int fib(int n) {
        
        return F(n);
    }

    static int F(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return F(n - 1) + F(n - 2);
    }

}

    

