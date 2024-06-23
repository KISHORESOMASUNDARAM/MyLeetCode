class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='['){
                st.push(c);
            }
            if(c==']'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            
        }
        int n=st.size();
        return n%2==0? n/2:(n+1)/2;
        
    }
}