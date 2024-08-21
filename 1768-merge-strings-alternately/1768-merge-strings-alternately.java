class Solution {
    public String mergeAlternately(String s1,String s2) {

         StringBuilder str1=new StringBuilder(s1);
          StringBuilder str2=new StringBuilder(s2);
          String sr1=String.valueOf(str1.reverse());
          String sr2=String.valueOf(str2.reverse());
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char c1:sr1.toCharArray()){
            st1.push(c1);
        }

        for(char c2:sr2.toCharArray()){
            st2.push(c2);
        }
        String arr="";

        while(!st1.isEmpty() && !st2.isEmpty()){
            arr+=String.valueOf(st1.pop());
            arr+=String.valueOf(st2.pop());
        }

        if(st1.size()>=1){
            while(!st1.isEmpty()){
                arr+=String.valueOf(st1.pop());
            }
        }

        if(st2.size()>=1){
            while(!st2.isEmpty()){
                arr+=String.valueOf(st2.pop());
            }
        }
        return arr;

    }
}