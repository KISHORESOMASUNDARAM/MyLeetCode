class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind=0;
       if(ruleKey.equals("color")){
        ind=1;
       }
       else if(ruleKey.equals("name")){
        ind=2;
       }
        int cnt=0;
        for(List<String> item:items){
            if(item.get(ind).equals(ruleValue)){
                cnt++;
            }    
        } 
        
        return cnt;
    }
}