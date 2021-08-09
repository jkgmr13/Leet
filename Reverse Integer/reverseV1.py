class Solution:
    def reverse(self, x: int) -> int:
        s1 = str(x)[::-1]
        if('-' in s1):
            s1 = s1.replace('-','')
            s1 = '-'+s1
        num = int(s1)
        return num if -2**31 < num < 2**31-1 else 0    