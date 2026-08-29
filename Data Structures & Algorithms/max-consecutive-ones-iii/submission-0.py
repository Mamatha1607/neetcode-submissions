class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        
        maxZeroes=0
        Result=0
        left=0
        for right in range(len(nums)):
            if nums[right] == 0:
                maxZeroes+=1
            while maxZeroes>k:
                if nums[left]==0:
                  maxZeroes-=1
                left+=1
            Result=max(Result,right-left+1)
        return Result

        