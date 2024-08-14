class Solution {
    public int[][] generateMatrix(int n) {
        int sr=0,sc=0; ;  
       int[][] arr=new int[n][n];
        int er=n-1,ec=n-1;  
        int d=0;
        int k=1;
        while(sr<=er && sc<=ec){ 
            if(d==0){ 
                for(int i=sc;i<=ec;i++){ 
                    arr[sr][i]=k++;
                } 
                sr++; 
           
            } 
            else if(d==1){ 
                for(int i=sr;i<=er;i++){ 
                    arr[i][ec]=k++;
                }
                ec--; 
              
            }  
            else if(d==2){ 
                for(int i=ec;i>=sc;i--){ 
                    arr[er][i]=k++;
                } 
                er--; 
              
            } 
            else{ 
                for(int i=er;i>=sr;i--){ 
                    arr[i][sc]=k++;
                } 
                sc++; 
            }
            d=(d+1)%4;
            }
        return arr;
        }
}
   
       
    