class PalindromeNumberV1 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int[] arr = new int[10];
        long sum = 0;
        int count = 0;
        while(x/10 != 0){
            arr[count] = Math.abs(x%10);
            x/=10;
            count+=1;
        }
        arr[count] = Math.abs(x%10);
       double base = Math.pow(10,count);
        for(Integer n : arr){
            sum+=n*base;
            base/=10;
        }
        return sum == y;
    }
}