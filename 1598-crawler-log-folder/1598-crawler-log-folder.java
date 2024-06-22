class Solution {
    public int minOperations(String[] logs) {
        int cnt=0,n=logs.length;
        for(String str:logs){
            if(str.contains("../")){
                if(cnt!=0){
                cnt--;
                }
            }
            else if(str.contains("./")){
                continue;
            }
            else{
                cnt++;
            }
            
        }
        if(cnt<=0){
            return 0;
        }
        return cnt;
    }
}