class Solution:
    def trap(self, height: List[int]) -> int:
        leftMax=0
        area=0
        rightMax=0
        left=0
        right=len(height)-1
        while(left<right):
            leftMax=max(leftMax,height[left]) 
            rightMax=max(rightMax,height[right])  
            if leftMax>=rightMax:
                area+=rightMax-height[right]
                right-=1
            else:
                area+=leftMax-height[left]
                left+=1
        return area
            

       