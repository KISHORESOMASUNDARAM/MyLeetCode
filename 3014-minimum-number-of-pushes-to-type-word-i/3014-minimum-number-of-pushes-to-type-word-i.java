class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int sum=0,c=0;
        for(int i=0;i<n;i++){
            if(i%8==0){
                c++;
            }
            sum+=c;
        }
        return sum;
        
    }
}