/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int res=0;
        /*for(int i=n;i>=0;i--){
            boolean ans=isBadVersion(i);
            if(ans==false){
                return i+1;
            }
           
        }*/
        while(left<=right){
            int mid=left+(right-left)/2;
            boolean ans=isBadVersion(mid);
            if(ans==true){
                right=mid-1;
            }
            else{
                left=mid+1;
                res=mid;
            }
        }
        return res+1;
        
    }
}