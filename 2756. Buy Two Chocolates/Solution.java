class Solution {
    public int buyChoco(int[] prices, int money) {
      int firstmincost=Integer.MAX_VALUE;
      int secondmincost=Integer.MAX_VALUE;
      for(int i:prices){
          if(i<firstmincost){
              secondmincost=firstmincost;
              firstmincost=i;
          }else{
              secondmincost=Math.min(secondmincost,i);
          }
      }
      int leftmoney=money-(firstmincost+secondmincost);
      return leftmoney>=0?leftmoney:money;  
    }
}