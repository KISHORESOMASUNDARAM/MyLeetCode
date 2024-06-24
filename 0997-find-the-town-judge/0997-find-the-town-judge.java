class Solution {
    public int findJudge(int n, int[][] trust) {
        int n1=trust.length;
        int ans=-1;
        int indegree[]=new int[n+1];
        int out[] =new int[n+1];
        for(int i=0;i<trust.length;i++){
            indegree[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        for(int i=0;i<=n;i++){
            if(indegree[i]==n-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
}