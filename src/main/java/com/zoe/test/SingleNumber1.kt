package com.zoe.test

/**
 * @author zoe
 **/
class SingleNumber1 {

    fun singNumber(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var z = nums[0]
        if (nums.isNotEmpty()){
            for (num in 1 until nums.size){
                z = z xor nums[num]
            }
        }
        return z
    }
}

object SingTest{
    @JvmStatic
    fun main(args: Array<String>){
        print(1)
    }
}