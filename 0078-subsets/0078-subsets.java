class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out=new ArrayList<>();
        out.add(new ArrayList<Integer>());
        for(int t:nums){
            int n=out.size();
            for(int i=0;i<n;i++){
                List<Integer> n1=new ArrayList<>(out.get(i));
                n1.add(t);
                out.add(n1);
            }
        }
        return out;
       /* List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        subset(arr,nums,n);
        return arr;
    }
    public void subset(List<List<Integer>> arr,int[] num,int n){
        List<Integer> ar=new ArrayList<>();
        int t=n;
        if(t>0){
            arr.add(ar);
            return;
        }
        for(int i=0;i<n;i++){
            ar.add(num[i]);
            t--;
        }
        subset(arr,num,t);*/

    }
}