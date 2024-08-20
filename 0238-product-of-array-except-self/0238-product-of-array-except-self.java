class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int sum=1,cnt=0;
        int f=0,tar=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt++;
                tar=i;
                if(cnt>1){
                    f=1;
                    break;
                }
            }
            else{
                f=0;
                sum*=nums[i];
            }
        }
        if(cnt==1){
            sum=1;
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    sum*=nums[i];
                }
            }
            arr[tar]=sum;

        }
        if(f==1){
            sum=1;
            for(int i=0;i<n;i++){
               arr[i]=0;
            }
        }
        if(cnt==0){
            for(int i=0;i<n;i++){
                arr[i]=sum/nums[i];
            }
        }
        return arr;
        
    }
}  
