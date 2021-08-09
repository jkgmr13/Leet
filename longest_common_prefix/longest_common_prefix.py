class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        str_sort = lambda x: len(x)
        strs.sort(key=str_sort)
        s = ""
        for n in range(len(strs[0])):
            for i in range(len(strs)):
                if strs[0][n]!=strs[i][n]:
                    return s
            s+=strs[0][n]
        return s
        