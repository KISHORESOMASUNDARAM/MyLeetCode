class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0,ans1=0;
        if(m%2==0 && n%2==0){
            return 0;
        }
        else if((n%2==0 && m%2==1)){
            for(int i=0;i<n;i++){
                ans^=nums1[i];
            }
        }
        else if((n%2==1 && m%2==0)){
             for(int i=0;i<m;i++){
                ans^=nums2[i];
            }
        }
        else{
             for(int i=0;i<n;i++){
                ans^=nums1[i];
            }
             for(int i=0;i<m;i++){
                ans^=nums2[i];
            }
        }
        return ans;
    }
}