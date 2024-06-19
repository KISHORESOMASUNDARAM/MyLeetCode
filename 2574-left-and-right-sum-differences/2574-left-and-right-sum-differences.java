class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int l1=left(nums,nums[i],i);
            int r1=right(nums,nums[i],i);
            arr[i]=Math.abs(l1-r1);
        }
        return arr;
    }
    int left(int[] nums,int n,int i){
        int sum=0;
        if(i-1<0){
            return 0;
        }
        for(int j=i-1;j>=0;j--){
            sum+=nums[j];
        }
        return sum;
    }
    int right(int[] nums,int n,int i){
        int sum=0;
        if(i==nums.length){
            return 0;
        }
        for(int j=i+1;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
    }
}