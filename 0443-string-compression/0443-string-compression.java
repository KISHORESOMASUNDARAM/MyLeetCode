class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) {
            return 1;
        }
        
        int j = 0; 
        int cnt = 1; 
        
        for (int i = 1; i < n; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++; 
            } else {
                chars[j++] = chars[i - 1]; 
                if (cnt > 1) {
                    
                    for (char c : Integer.toString(cnt).toCharArray()) {
                        chars[j++] = c;
                    }
                }
                
                cnt = 1; 
            }
        }
        chars[j++] = chars[n - 1];
        if (cnt > 1) {
            for (char c : Integer.toString(cnt).toCharArray()) {
                chars[j++] = c;
            }
        }
        
        return j; 
    }
}
