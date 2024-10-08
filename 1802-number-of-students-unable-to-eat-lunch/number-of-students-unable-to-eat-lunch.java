class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int arr[]=new int[2];   
        for(int s:students){
            arr[s]++;
        }
        for(int i=0;i<n;i++){
            if(arr[sandwiches[i]]==0)return n-i;
            arr[sandwiches[i]]--;
        }
        return 0;
    }
}