class Solution {
    public int islandPerimeter(int[][] grid) {
        int cnt=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
              if(grid[i][j]==1){
                if(i==0){
                    cnt=1;
                }
                else{
                    if(grid[i-1][j]==0){
                        cnt++;
                    }
                }
                if(j==0){
                    cnt++;
                }
                else{
                   if(grid[i][j-1]==0){
                        cnt++;
                    }
                }
                if(i==r-1){
                    cnt++;
                }
                else{
                    if(grid[i+1][j]==0){
                        cnt++;
                    }
                }
                if(j==c-1){
                   cnt++;
                }
                else{
                    if(grid[i][j+1]==0){
                        cnt++;
                    }
                }
              }
            }
            
        }
        return cnt;
       
    }
}