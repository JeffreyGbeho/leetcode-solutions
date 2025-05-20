# Last updated: 20/05/2025 23:23:08
class Solution(object):
    def getMaximumXor(self, nums, maximumBit):
        n = len(nums)
        ans = [0] * n
        val = (1 << maximumBit) - 1  # Equivalent to 2^maximumBit - 1
        
        curr = 0
        for num in nums:
            curr ^= num

        for i in range(n):
            ans[i] = curr ^ val
            curr ^= nums[n - 1 - i]

        return ans
        