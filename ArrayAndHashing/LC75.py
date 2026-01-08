#sort colors

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        start=0
        end= len(nums)-1
        mid=0

        while mid<=end:
            if nums[mid]==0:
                temp=nums[mid]
                nums[mid]=nums[start]
                nums[start]=temp
                start=start+1
                mid=mid+1
            elif nums[mid]==1:
                mid=mid+1
            else:
                temp=nums[mid]
                nums[mid]=nums[end]
                nums[end]=temp
                end = end-1
