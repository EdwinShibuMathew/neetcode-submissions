class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        maxl = 0

        for n in nums:
            if n-1 in s:
                continue
            else:
                curl = 1
                while n + 1 in s:
                    curl += 1
                    n += 1
                maxl = max(maxl,curl)

        return maxl