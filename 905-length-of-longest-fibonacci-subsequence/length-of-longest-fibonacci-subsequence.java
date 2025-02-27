class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }
        int [][]t=new int[n][n];
        for(int row[]:t){
            Arrays.fill(row,2);
        }

        int maxLen=0;
        for(int j=1;j<n;j++){
            for(int k=j+1;k<n;k++){
                int b=arr[k];
                int a=arr[j];
                int target=b-a;
                if(hm.containsKey(target)&&hm.get(target)<j){
                    int i=hm.get(target);
                    t[j][k]=t[i][j]+1;
                }
                maxLen=Math.max(t[j][k],maxLen);
            }
        }
        return maxLen>=3?maxLen:0;
    }
}