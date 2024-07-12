class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
       int n=s.length();
       int m=s.length();
       if(n!=m){
        return false;
       }
       for(int i=0;i<n;i++){
          char c1=s.charAt(i);
          char c2=t.charAt(i);
          if(map.containsKey(c1)){
            if(!map.get(c1).equals(c2)){
                return false;
            }
          }
          else{
            if(map.containsValue(c1)){
                return false;
            }
            map.put(c1,c2);
          }
       }
        return true;
        
    }
}