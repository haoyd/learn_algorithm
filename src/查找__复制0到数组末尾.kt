/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
object 查找__复制0到数组末尾 {


    @JvmStatic
    fun main(args: Array<String>) {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        val newNums = move0(nums)
        printIntArray(newNums)
    }

    /**
     * 思想：
     * 用一个指针指向存放非 0 的位置，发现一个往里存一个，剩下的位置为 0
     */
    private fun move0(nums: IntArray): IntArray {
        var index = 0

        for (i in nums.indices) {
            if (nums[i] == 0) {
                continue
            }

            if (i != index) {
                nums[index] = nums[i]
                nums[i] = 0
            }

            index++
        }

        return nums
    }
}