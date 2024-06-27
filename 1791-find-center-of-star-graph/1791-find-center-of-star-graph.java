class Solution {
    public int findCenter(int[][] edges) {
        int cnt=0,c=0;
        int n1=edges[0][0];
        int n2=edges[0][1];
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[i].length;j++){
                
                if(n1==edges[i][j]){
                    cnt++;
                }
                else if(n2==edges[i][j]){
                    c++;
                }
            }
        }
        if(cnt>c){
            return n1;
        }
        return n2;
        
    }
}