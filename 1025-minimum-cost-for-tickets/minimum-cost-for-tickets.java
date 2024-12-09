class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        boolean isPresent[]=new boolean[days[days.length-1]+1];

        //traverse the array and mark each day t/f

        for(int c:days){
            isPresent[c]=true;//Mark travel days
        }

        Integer []dp=new Integer[isPresent.length];

        return solve(isPresent,days[0],costs,dp);
    }
    //recursive function
    public int solve(boolean isPresent[],int day,int costs[],Integer []dp){
        if(day>=isPresent.length){
            return 0;
        }
        if(dp[day]!=null){
            return dp[day];
        }
        //we will check if we have travel that day if true then we wil, calculate the cost for that day
        if(isPresent[day]){
            int a=costs[0]+solve(isPresent,day+1,costs,dp);//for day 1
            int b=costs[1]+solve(isPresent,day+7,costs,dp);//for day 7
            int c=costs[2]+solve(isPresent,day+30,costs,dp);//for day 30
            return dp[day]=Math.min(a,Math.min(b,c));
        }else{
            dp[day]=solve(isPresent,day+1,costs,dp);
        }
        return dp[day];
    }
}