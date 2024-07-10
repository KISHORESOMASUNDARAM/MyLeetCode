class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int i=0,j=0;
        int n=num1.length;
        int m=num2.length;
        int num[]=new int[n+m];
        int k=0;
        double ans=0;
        while(i<n && j<m){
            if(num1[i]<num2[j]){
                num[k]=num1[i];
                i++;
            }
            else if(num1[i]>num2[j]){
                num[k]=num2[j];
                j++;
            }
            k++;
        }
        if(i<n){
            while(i<n){
                num[k]=num1[i];
                k++;
                i++;
            }
        }
        if(j<m){
            while(j<m){
                num[k]=num2[j];
                j++;
                k++;
            }
        }
        int mod=(n+m)%2;
        int div=(n+m)/2;
        if(mod==1){
            return num[div];
        }
        if(mod==0){
            ans=(num[div]+num[div-1])/2.0;
        }
        return ans;
    }
}