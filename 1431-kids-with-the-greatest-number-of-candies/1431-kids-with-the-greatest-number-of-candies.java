class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        int n=candies.length;
        List<Boolean> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max>(candies[i]+extraCandies)){
                arr.add(false);
            }
            else{
                arr.add(true);
            }
        }
        return arr;

        
    }
}