class Solution {
    public static Integer dp[][]=new Integer[2][2];
    public int numRollsToTarget(int n, int k, int target) {
    dp=new Integer[n+1][target+1];

       return numshelper(n,k,target);
    }
    public static int numshelper(int n,int k, int sum){
        // int mod=1000000007;
        if(n==0||sum<=0){
            if(sum==0&&n==0){
                return 1;
            }
            return 0;

        }
        if(dp[n][sum]!=null){
        return dp[n][sum];
        }
            
        int res=0;
        for(int i=1;i<=k;i++){
            res=(res+numshelper(n-1,k,sum-i))%(int)(1e9+7);
        }
        dp[n][sum]= res;
        return res;
    }

}