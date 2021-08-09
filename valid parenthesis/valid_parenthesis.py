class Solution:
    def isValid(self, s: str) -> bool:
        x = []
        try:
            for c in s:
                if c == '(':
                    x.append(1)
                if c == '{':
                    x.append(2)
                if c == '[':
                    x.append(3)
                if c == ')':
                    if x.pop() != 1:
                        return False
                if c == '}':
                    if x.pop() != 2:
                        return False
                if c == ']':
                    if x.pop() != 3:
                        return False
            return len(x) == 0
        except Exception:
            return False
            
        