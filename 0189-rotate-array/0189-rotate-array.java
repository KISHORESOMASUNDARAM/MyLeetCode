class Solution {
    public int[] rotate(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        k=k%n;
        for(int i=n-k,j=n-1;i<j;i++,j--){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

         for(int i=0,j=n-k-1;i<j;i++,j--){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
         for(int i=0,j=n-1;i<j;i++,j--){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}