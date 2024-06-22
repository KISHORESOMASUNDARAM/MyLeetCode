class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int cnt=0,k=1;
        char c;
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(k!=1){
                    str+=s.charAt(i);
                }
                k++;
            }
            else if(s.charAt(i)==')'){
                k--;
                if(k!=1){
                    str+=s.charAt(i);
                }
            }
            /*st.push(s.charAt(i));
            if(st.peek()=='('){
                k++;
            }
            else if(k==0){
                st.pop();
            }
        
            else if(st.peek()==')'){
                k--;
            }
            /*if(st.peek()=='(' && cnt==0){
                str+=st.peek();
                cnt=1;
                st.pop();
            }
            else if(st.peek()==')' && cnt==1){
                str+=st.peek();
                cnt=0;
                st.pop();
            }
            else{
                st.pop();
            }*/
        }
        return str;
    }
}