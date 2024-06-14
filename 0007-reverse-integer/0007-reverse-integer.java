class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0){
            x=-x;
            flag=1;
        }
        else{
            flag=0;
        }
        int val=0;
        String str=" ";
        str=String.valueOf((char) x);
        int n=str.length();
        StringBuilder num = new StringBuilder();
        while (x > 0) {
            int digit = x % 10;
            num.append(digit);
            x /= 10;
        }
        try {
            val = Integer.parseInt(num.toString());
        } 
        catch (NumberFormatException e) {
            return 0;
        }
        if(flag==1){
            return -val;
        }
        else{
            return val;

        } 
        


        
    }
}