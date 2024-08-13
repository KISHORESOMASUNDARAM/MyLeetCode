class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }

        int a=q.peek();
        q.poll();
        int b=q.peek();
        q.poll();
        int c=q.peek();
        int ans=a*b*c;
        return ans;

    }
}