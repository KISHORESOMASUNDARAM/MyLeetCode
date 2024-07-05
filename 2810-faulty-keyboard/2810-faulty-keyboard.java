class Solution {
    public String finalString(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length(),j=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='i'){
                str.reverse();
                continue;
            }
            else{
                str.insert(j,c);
                j++;
            }
        }
        return str.toString();
        
    }
}