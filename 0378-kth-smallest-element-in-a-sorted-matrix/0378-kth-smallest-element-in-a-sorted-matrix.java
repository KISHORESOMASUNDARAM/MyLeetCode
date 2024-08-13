class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0;
        int[] arr=new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[l]=matrix[i][j];
                l++;
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b - a);
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();

    }
}