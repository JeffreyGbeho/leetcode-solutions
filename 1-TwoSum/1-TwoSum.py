class Solution(object):
    def twoSum(self, nums, target):
        for i, num in enumerate(nums):
            f = target - num
            for j, n in enumerate(nums):
                if n == f and i != j:
                    return [i, j]