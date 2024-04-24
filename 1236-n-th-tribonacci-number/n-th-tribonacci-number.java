class Solution {
    int t[]=new int[38];
    public int fib(int n){
        
        if(n==0)return 0;
         if (n==1||n==2)return 1;
        if(t[n]!=-1)return t[n];
         return t[n]=fib(n-1)+fib(n-2)+fib(n-3);
    }
    public int tribonacci(int n) {
        Arrays.fill(t,-1);
        return fib(n);
        
    }
}