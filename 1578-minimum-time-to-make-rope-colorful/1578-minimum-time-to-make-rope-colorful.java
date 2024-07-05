class Solution {
    public int minCost(String col, int[] nt) {
        List<Integer> arr=new ArrayList<>();
        int n=col.length();
        int sum=0,idx=0;
        for(int i=1;i<n;i++){
             if(col.charAt(i)==col.charAt(i-1)){
                sum+=Math.min(nt[i],nt[i-1]);
                nt[i]=Math.max(nt[i],nt[i-1]);
             }
        }
        return sum;
    }
}