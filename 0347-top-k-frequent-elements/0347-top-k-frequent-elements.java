class Solution {
    public int[] topKFrequent(int[] num, int h) {
       List<Integer>[] ar=new ArrayList[num.length+1];
       HashMap<Integer,Integer> map=new HashMap<>();

       for(int n:num){
         map.put(n,map.getOrDefault(n,0)+1);
       }
       int[] arr=new int[h];
       for(int m:map.keySet()){
        int fre=map.get(m);
        if(ar[fre] == null ){
           ar[fre] =new ArrayList<>();
        }
        ar[fre].add(m);
       }
       int cnt=0;
       for(int i=ar.length-1;i>=0 && cnt<h;i--){
        if(ar[i] != null){
            for(int k: ar[i]){
               arr[cnt++]=k;
            }
        }
       }
       return arr;
    }
}