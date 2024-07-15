class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int k=0;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums[nums[i]]);
        }
        for(int j:arr){
            nums[k]=arr.get(k);
            k++;
        }
        return nums;
    }
}