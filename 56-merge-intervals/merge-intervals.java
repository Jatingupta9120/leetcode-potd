class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, Comparator.comparingInt(a ->a[0]));
       ArrayList<int []>list=new ArrayList<>();

       for(int i=0;i<intervals.length;i++){
        int st=intervals[i][0];
        int end=intervals[i][1];

        while(i+1<intervals.length&&intervals[i+1][0]<=end){
            end=Math.max(end,intervals[i+1][1]);
            i++;
        }
         list.add(new int[]{st, end});
       }
    return list.toArray(new int[list.size()][]); 
    }
}