class Solution {
    public int balancedStringSplit(String s) {
        int min=0;
        int balance=0;
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='L'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                cnt++;
            }
        }
        return cnt;
        
    }
}