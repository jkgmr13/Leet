import java.lang.Math;
class ReverseV2 {
    public int reverse(int x) {
        int[] arr = new int[10];
        long sum = 0;
        int count = 0;
        boolean isNegative = x < 0;
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
        if(isNegative) sum*=-1;
        return (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) ? 0 : (int) sum;
        
    }
}