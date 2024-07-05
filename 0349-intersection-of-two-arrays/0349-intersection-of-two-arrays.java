class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int idx=0;
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(ar.contains(nums2[i])){
               map.add(nums2[i]);
            }
        }
        ar.clear();
        ArrayList<Integer> a=new ArrayList<>(map);
        int[] arr=new int[map.size()];
        for(int i=0;i<a.size();i++){
            arr[idx]=a.get(i);
            idx++;
        }
        return arr;
    }
}