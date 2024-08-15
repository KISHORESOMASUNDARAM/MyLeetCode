class Solution {
    public int[] decode(int[] encoded) {
        int e=0;
        int n=encoded.length;
       
        for(int i=1;i<=n+1;i++){
            e^=i;
        }
        int ele=0;
        for(int i=1;i<n;i=i+2){
            ele^=encoded[i];
        }
        ele^=e;
        int m=n+1;
        int[] arr=new int[n+1];
        arr[0]=ele;
        int k=m;
       
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        
        return arr;

    }
}