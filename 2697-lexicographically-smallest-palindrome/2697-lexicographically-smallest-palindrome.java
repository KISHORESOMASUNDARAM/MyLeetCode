class Solution {
    public String makeSmallestPalindrome(String s) {
        String str="";
        char[] arr=new char[s.length()];
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                arr[i]=s.charAt(i);
                arr[j]=s.charAt(j);
            }
            else if(s.charAt(i)!=s.charAt(j)){
                int c1=s.charAt(i)+0;
                int c2=s.charAt(j)+0;
                if(c1<c2){
                arr[i]=s.charAt(i);
                arr[j]=s.charAt(i);
                }
                else{
                    arr[i]=s.charAt(j);
                    arr[j]=s.charAt(j);
                }
            }
            i++;
            j--;
        }
        for(char c:arr){
            str+=String.valueOf(c);
        }
        return str;
        
    }
}