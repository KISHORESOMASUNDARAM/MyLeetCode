class Solution {
    public void sortColors(int[] nums) {
        int count=0,k=0,n=0;
        
        int x=0,a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            if(x==0){
            a++;
            }
            else if(x==1){
                b++;
            }
            else{
                c++;
            }
            
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(a!=0){
            nums[j]=0;
              a--;
            }
            else if(b!=0){
                nums[j]=1;
                b--;
            }
            else if(c!=0){
                nums[j]=2;
                c--;
            }
            
        }
        System.out.print(nums);
    }
}