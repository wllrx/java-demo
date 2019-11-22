package com.zoe.test

import java.util.*

/**
 * 两个数组的交集ii
 * nums1 = {1, 2, 2, 1};
 * nums2 = {2, 2};
 * 输出[2,2]
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致
 * @author zoe
 */
object Intersect {

    @JvmStatic
    fun main(args: Array<String>) {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val intersect = intersect(nums1, nums2)
        println(Arrays.toString(intersect))
    }

    private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()
        var i = 0
        var j = 0
        val list = arrayListOf<Int>()
        while (i < nums1.size && j < nums2.size) {
            when {
                nums1[i] == nums2[j] -> {
                    list.add(nums1[i])
                    i++
                    j++
                }
                nums1[i] > nums2[j] -> j++
                else -> i++
            }
        }
        return list.run { stream().mapToInt { it.toInt() }.toArray() }
    }
}
