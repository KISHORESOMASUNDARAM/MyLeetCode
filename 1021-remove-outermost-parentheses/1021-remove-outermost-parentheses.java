class Solution {
    public String removeOuterParentheses(String s) {
        int k=1,n=s.length()-1;
        char c;
        String str="";
        for(int i=0;i<=n;i++){
            c=s.charAt(i);
            if(c=='('){
                if(k!=1){
                    str+=c;
                }
                k++;
            }
            else if(c==')'){
                k--;
                if(k!=1){
                    str+=c;
                }
            }
        }
        return str;
    }
}