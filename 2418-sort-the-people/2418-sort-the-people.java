class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n= names.length;
        List<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(heights[i],names[i]));
        }
        arr.sort((a,b) -> Integer.compare(b.height,a.height));
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=arr.get(i).name;
        }
        return ans;
        /*HashMap<Integer,String> map=new HashMap<>();
        int n=names.length;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=n-1;i>=0;i--){
            arr[i]=map.get(heights[i]);
        }
        return arr;*/
    }
     static class Pair {
        int height;
        String name;

        Pair(int height, String name) {
            this.height = height;
            this.name = name;
        }
    }
}