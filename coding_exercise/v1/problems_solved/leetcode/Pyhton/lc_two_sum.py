def twoSum(self, nums, target):
    dict = {}
    if len(nums) > 0:
        dict[nums[0]] = 0
    for index in range(1, len(nums)):
        num = nums[index]
        find_num = target - num
        if dict.get(find_num, -1) >= 0:
            return [dict[find_num], index]
        dict[num] = index
    return []
