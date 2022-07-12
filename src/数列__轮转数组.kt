/**
    输入: nums = [1,2,3,4,5,6,7], k = 3
    输出: [5,6,7,1,2,3,4]
    解释:
    向右轮转 1 步: [7,1,2,3,4,5,6]
    向右轮转 2 步: [6,7,1,2,3,4,5]
    向右轮转 3 步: [5,6,7,1,2,3,4]
 */
object 数列__轮转数组 {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotate(intArray, 3)

        for (i in intArray) {
            print("$i ")
        }
    }

    private fun rotate(nums: IntArray, k: Int) {
        val length = nums.size

        val newArr = IntArray(length)
        for (i in nums.indices) {
            val pos = (i + k) % length
            newArr[pos] = nums[i]
        }

        for (i in nums.indices) {
            nums[i] = newArr[i]
        }
    }
}