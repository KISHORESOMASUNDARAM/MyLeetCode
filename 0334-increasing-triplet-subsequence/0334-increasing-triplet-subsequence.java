class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        int cnt=0;
        int n=nums.length;
        for(int num:nums){
            if(num<=min){
                min=num;
            }
            else if(num<=min1){
                min1=num;
            }
            else{
                return true;
            }
        }
        return false;
        
        
    }
}