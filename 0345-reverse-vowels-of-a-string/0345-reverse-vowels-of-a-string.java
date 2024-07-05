class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char c='a';
        ArrayList<Character> arr=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            if(c=='a' || c=='i'||c=='e' || c=='o' ||c=='u'|| c=='A' ||c=='E' ||c=='I' || c=='O' ||c=='U'){
                arr.add(c);
            }
        }
        int j=0;
        Collections.reverse(arr);
        for(int i=0;i<n;i++){
            c=s.charAt(i);
           if(c=='a' || c=='i'||c=='e' || c=='o' ||c=='u'|| c=='A' ||c=='E' ||c=='I' || c=='O' ||c=='U'){
                str.insert(i,arr.get(j));
                j++;
            } 
            else{
                str.insert(i,c);
            }
        }
        return str.toString();
        
    }
}