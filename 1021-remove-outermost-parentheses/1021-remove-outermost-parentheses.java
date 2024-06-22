class Solution {
    public String removeOuterParentheses(String s) {
        int k=1;
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
        }
        return str;
    }
}