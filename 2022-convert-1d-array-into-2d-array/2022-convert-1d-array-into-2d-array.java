class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        int r=0,c=0;
        int n1=0;
        int[][] ar=new int[0][0];
        if(n*m!=original.length){
            return ar;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[n1];
                n1++;
                if(n1==original.length){
                    break;
                }
            }
        }
        return arr;
        
    }
}