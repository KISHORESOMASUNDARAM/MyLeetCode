class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] arr=new int[n];
        int sum=0,k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(i-j);
                }
                else if(boxes.charAt(i)=='0'){
                    k=i;
                    if(k>=0){
                    if(boxes.charAt(k--)=='1'){
                    sum+=Math.abs(j-i);
                    }
                   }
                    if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(i-j);
                    }
                }

            }
                arr[i]=sum;
                sum=0;
        }
        return arr;
        
    }
}