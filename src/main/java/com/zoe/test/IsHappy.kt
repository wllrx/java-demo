package com.zoe.test

/**
 * @author zoe
 */
 object IsHappy {

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 19
        val happy = isHappy(n)
        println(happy)
    }

    private fun isHappy(n: Int): Boolean {
        var n = n
        while (n != 1 && n != 4) {
            var temp = 0
            while (n != 0) {
                temp += n % 10 * (n % 10)
                n /= 10
            }
            n = temp
        }
        return n == 1
    }
}

