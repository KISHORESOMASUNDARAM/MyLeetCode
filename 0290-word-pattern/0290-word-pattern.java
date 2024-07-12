

class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> map=new HashMap<>();
        int n=p.length();
        String[] str=s.split(" ");
        int m=str.length;
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            if(map.containsKey((p.charAt(i)))){
                if(!str[i].equals(map.get(p.charAt(i)))){
                    return false;
                }
            }
            else{
                if(map.containsValue(str[i])){
                 return false;
                }
              map.put(p.charAt(i),str[i]);
            }
            
        }
        return true;
    }
}

