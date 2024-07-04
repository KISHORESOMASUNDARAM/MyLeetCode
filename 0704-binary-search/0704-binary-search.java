class Solution {
    public int search(int[] n, int tar) {
        int i=0;
        if(n[0]==tar){
            return 0;
        }
        int j=n.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(n[mid]==tar){
                return mid;
            }
            if(n[mid]>tar){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }
}