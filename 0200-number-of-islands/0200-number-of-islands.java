class Solution {

    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0) {
            return 0;
        }
        int m= grid.length;
        int n= grid[0].length;
        boolean[][] check = new boolean[m][n];
        int cnt = 0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (grid[i][j]=='1'&&!check[i][j]) {
                    cnt++;
                    call(grid, i, j, check);
                }
            }
        }
        return cnt;
    }
    void call(char[][] grid, int i, int j, boolean[][] check) {
        int m = grid.length;
        int n= grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >=n||grid[i][j]=='0'||check[i][j]) {
            return;
        }
        check[i][j] = true;
        call(grid, i + 1,j,check);
        call(grid,i-1,j,check);
        call(grid,i,j+1,check);
        call(grid,i,j-1,check);
    }
}