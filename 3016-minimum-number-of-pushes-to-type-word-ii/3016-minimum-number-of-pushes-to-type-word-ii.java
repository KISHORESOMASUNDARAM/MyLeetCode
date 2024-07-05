class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int idx=0,c=0,sum=0,cnt=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            cnt=map.containsKey(word.charAt(i))? map.get(word.charAt(i))+1:1;
            map.put(word.charAt(i),cnt);
        }
        int j=0;
        int[] arr=new int[map.size()];
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            arr[j]=entry.getValue();
            j++;
        }
        int k=0,l=arr.length-1;
        Arrays.sort(arr);
       while(k<l){
          int temp=arr[k];
          arr[k]=arr[l];
          arr[l]=temp;
          k++;
          l--;
       }
        j=0;
        int pro=0;
        for(int m=0;m<map.size();m++){
            if(m%8==0){
                c++;
            }
            pro=c*arr[m];
            sum+=pro;
        }
        return  sum;
        
    }
}