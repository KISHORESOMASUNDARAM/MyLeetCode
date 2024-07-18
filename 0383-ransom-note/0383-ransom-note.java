class Solution {
    public boolean canConstruct(String r, String m) {
        int n1=m.length();
        int n2=r.length(); 
        int[] arr=new int[26];
        for(int i=0;i<n1;i++){
            int c=m.charAt(i)+0;
            arr[c-97]+=1;
        }
        for(int i=0;i<n2;i++){
            int k=r.charAt(i)+0;
            arr[k-97]--;
        }
        for(int i=0;i<26;i++){
            if(i<n2){
            int c=r.charAt(i)+0;
            if(arr[c-97]!=0){
                return false;
            }

            }
        }
        return true;
    }
}