class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> str=new ArrayList<>();
        String s="";
        valid(n,n,str,"");
        return str;
    }
    public void valid(int op,int cl,ArrayList<String> str,String s){
        if(op==cl && op==0){
            str.add(s);
            return;
        }
        if(op>0){
            valid(op-1,cl,str,s+"(");
        }
        if(cl>0 && cl>op){
            valid(op,cl-1,str,s+")"); 
        }
      


    } 
}