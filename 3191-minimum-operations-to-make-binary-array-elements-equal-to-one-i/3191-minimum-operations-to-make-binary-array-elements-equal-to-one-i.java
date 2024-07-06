class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int cnt=0,flag=0;
        int ans=0;
        if(n<2) return -1;
        for(int i=0;i<n;i++){  
            if(nums[i]==0 && i+2<n){
                cnt++;
            nums[i]=nums[i]==1? 0:1;
            nums[i+1]=nums[i+1]==1? 0:1;
            nums[i+2]=nums[i+2]==1? 0:1;
            }
        }
        for(int n1:nums){
            if(n1==0){
                return -1;
            }
        }
        return cnt;
    }
}