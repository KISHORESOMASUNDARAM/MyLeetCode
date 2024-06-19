class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int m=n/2;
        int[] r1=new int[m];
        int[] r2=new int[m];
        int a=0,f=0,j=0,k=0;
        int[] ar=new int[nums.length];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
              r1[j]=nums[i];
              j++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                r2[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<n;i++){
            if(f==0){
          ar[i]=r1[j];
          j++;
          f=1;
            }
            else{
                ar[i]=r2[k];
                k++;
                f=0;
            }
        }
       


        return ar;
    }
      
    
}