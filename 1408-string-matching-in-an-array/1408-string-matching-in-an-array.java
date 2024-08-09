class Solution {
    public List<String> stringMatching(String[] word) {
        List<String> arr=new ArrayList<>();
        HashSet<String> map=new HashSet<>();
        for(String str: word){
            for(String s:word){
            if(!s.equals(str) && str.contains(s)){
                map.add(s);
            }
            }
        }

        for(String s1:map){
            arr.add(s1);
        }
        return arr;
        
    }
}