class Solution {
    public boolean rotateString(String s, String goal) {
    StringBuilder str=new StringBuilder(s);
    StringBuilder str1=new StringBuilder(goal);
    int n=s.length();
    int m=goal.length();
    if(n!=m){
        return false;
    }
    for(int i=0;i<n;i++){
        if(str.toString().equals(goal)){
            return true;
        }
            char c=str.charAt(0);
             str.deleteCharAt(0);
            str.append(c);
           
        
    }
    return false;
    }
}