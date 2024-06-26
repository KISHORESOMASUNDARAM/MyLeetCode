class Solution {
    public int largestCombination(int[] arr) {
        int[] ar=new int[32];
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<32;j++){
                temp=arr[i]& (1<<j);
                if(temp>0){
                    ar[j]++;
                }
            }
        }
        Arrays.sort(ar);
        return ar[31];
    }
} 