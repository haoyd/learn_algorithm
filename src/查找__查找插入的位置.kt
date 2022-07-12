/**
 * 查找__二分查找
 */
object 查找__查找插入的位置 {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(1,3,5,6)
        val target = 2
        val index = searchInsert(intArray, target)
        println("要插入的位置是第 $index 个元素")
    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            val mid = (end - start) / 2 + start
            val midValue = nums[mid]

            if (target == midValue) {
                return mid
            }

            if (target > midValue) {
                // 如果已经到最后一个元素，则插入到末尾
                if (mid == nums.size - 1) {
                    return nums.size
                }

                if (target < nums[mid + 1]) {
                    return mid + 1
                }

                start = mid + 1
            }

            if (target < midValue) {
                // 如果已经到第一个元素，则插入到首位
                if (mid == 0) {
                    return 0
                }

                if (target > nums[mid - 1]) {
                    return mid
                }

                end = mid - 1
            }
        }

        return start
    }
}