class Solution(object):
    def checkSubarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool

        - start with index 0, store prev index and prev values
        - for loop over numbers
            - if the sum value is greater than target, subtract prev value from sum and incr prev index and set prev value
            - if sum less then incr next index value , add it and continue
            - if current index value greater than target reset everything to current values and continue
        """
        if len(nums) == 0:
            return False
        prev_index = 0
        current_sum = nums[prev_index]
        if current_sum == k:
            return True
        for cur_index in range(1, len(nums)):
            cur_value = nums[cur_index]
            calc_sum = current_sum + cur_value
            intial_sum = calc_sum
            if cur_value > k:
                prev_index = cur_index
                current_sum = nums[prev_index]
            elif calc_sum > k:
                while calc_sum > k:
                    calc_sum = calc_sum - nums[prev_index]
                    prev_index = prev_index + 1
                current_sum = calc_sum
            else:
                current_sum = calc_sum
            if cur_value == k or calc_sum == k or intial_sum == k:
                return True
        return False
