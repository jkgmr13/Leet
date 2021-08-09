class Solution:
    def reverse(self, x: int) -> int:
        arr = []
        sum = 0
        count = 0
        isNeg = x < 0
        if isNeg:
            x*=-1
        while x//10 != 0:
            arr.append(abs(x%10))
            count+=1
            x//=10
        arr.append(abs(x%10))
        count = 10**count
       
        for n in arr:
            sum+=int(n*count)
            count//=10
        if isNeg:
            sum*=-1
        return sum if -2**31 < sum < 2**31-1 else 0