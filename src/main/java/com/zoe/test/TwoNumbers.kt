package com.zoe.test

/**
 * @author zoe
 */
class TwoNumbers {
    fun twoSum3(nums: IntArray, target: Int): IntArray? {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    return intArrayOf(i, j)
                }
            }
        }
        return IntArray(0)
    }
}
