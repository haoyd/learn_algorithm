/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 */
object 排序__有序数组的平方 {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(-7, -3, 2, 3, 11)
        val newArr = sortedSquares(intArray)
        for (i in newArr) {
            print("$i ")
        }
    }

    /**
     * 思路
     *
     * 双指针由两边向中间位移
     */
    fun sortedSquares(nums: IntArray): IntArray {
        val size = nums.size
        val newArr = IntArray(size)
        var left = 0
        var right = size - 1
        var pos = size - 1

        while (left <= right) {
            val leftNum = nums[left] * nums[left]
            val rightNum = nums[right] * nums[right]

            if (leftNum < rightNum) {
                newArr[pos] = rightNum
                right--
            } else {
                newArr[pos] = leftNum
                left++
            }

            pos--
        }
        return newArr
    }
}