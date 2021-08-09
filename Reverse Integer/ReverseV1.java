class Solution {
    public int ReverseV1(int x) {
        StringBuilder num = new StringBuilder(""+x);
        num.reverse();
        int ans = 0;
        if(num.indexOf("-") != -1){
            num.deleteCharAt(num.indexOf("-"));
            num.insert(0,"-");
        }
        
        long res = Long.parseLong(num.toString());
        ans = (int) res;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            ans = 0;
        return ans;
        
    }
}