class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0;
        char c='1',x='2';
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            if((c==')' && !st.isEmpty() && x=='(')){
                st.pop();
            }
            else{ st.push(c);
            x=st.peek();
            }
            
        }
        return st.size();
    }
}