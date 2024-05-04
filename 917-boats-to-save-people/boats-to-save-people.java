class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        int i=0;
        Arrays.sort(people);
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                boats++;
                j--;
            }else{
                j--;
                boats++;
            }
            
            
        }
        return boats;
    }
}