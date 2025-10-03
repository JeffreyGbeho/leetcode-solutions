# Last updated: 03/10/2025 19:43:27
class Solution:
    def lenLongestFibSubseq(self, arr: List[int]) -> int:
        result = 0
        n = len(arr)
        s = set(arr)
        # dp = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n-1):
            for j in range(i+1, n):
                f1, f2 = arr[i], arr[j]
                curr = 0
                while f1 + f2 in s:
                    curr += 1
                    f1, f2 = f2, f1+f2
                result = max(result, curr)

        return result + 2 if result else 0