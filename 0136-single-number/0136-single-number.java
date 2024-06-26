
import java.util.Map.Entry;
import java.util.Map;
class Solution {
    public int singleNumber(int[] nums) {
        int j=nums.length-1;;
        int val=0;
        int ans=0;
        for(int i=0;i<=j;i++){
            ans^=nums[i];
        }
        return ans;
      

      
    }
}