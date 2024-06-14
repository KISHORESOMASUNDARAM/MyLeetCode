class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder prefix = new StringBuilder(strs[0]);
        int n = strs.length;
        
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(prefix.toString()) != 0) {
                prefix.deleteCharAt(prefix.length() - 1);
                if (prefix.length() == 0) {
                    return "";
                }
            }
        }
        
        return prefix.toString();
    }
}
