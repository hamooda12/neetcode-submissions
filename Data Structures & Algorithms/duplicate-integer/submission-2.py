class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        list2=[]
        boolea=False
        for num in nums:
            if num in list2:
                boolea=True
                break
            list2.append(num)
        return boolea
        