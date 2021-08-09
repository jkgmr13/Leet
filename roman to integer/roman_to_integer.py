class Solution:
    def romanToInt(self, s: str) -> int:
        sum = 0;
        sum+=len(s.split('I'))-1
        sum+=5*(len(s.split('V'))-1)
        sum+=10*(len(s.split('X'))-1)
        sum+=50*(len(s.split('L'))-1)
        sum+=100*(len(s.split('C'))-1)
        sum+=500*(len(s.split('D'))-1)
        sum+=1000*(len(s.split('M'))-1)
        sum-=2*(len(s.split('IV'))-1)
        sum-=2*(len(s.split('IX'))-1)
        sum-=20*(len(s.split('XL'))-1)
        sum-=20*(len(s.split('XC'))-1)
        sum-=200*(len(s.split('CD'))-1)
        sum-=200*(len(s.split('CM'))-1)
        return sum
        
        
            