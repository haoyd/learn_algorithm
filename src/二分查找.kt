/**
 * 二分查找
 */
object 二分查找 {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val index = binSearch1(intArray, target)
        println("您找的是第 $index 个元素")

        val index2 = binSearch2(intArray, target, 0, intArray.size - 1)
        println("您找的是第 $index2 个元素")
    }

    /**
     * 普通二分查找
     */
    private fun binSearch1(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val middle = (end - start) / 2 + start
            val middleValue = nums[middle]

            when {
                target > middleValue -> start = middle + 1
                target < middleValue -> end = middle - 1
                else -> return middle
            }
        }

        return -1
    }

    /**
     * 递归二分查找
     */
    private fun binSearch2(nums: IntArray, target: Int, start: Int, end: Int): Int {
        val middle = start + (end - start) / 2
        val middleValue = nums[middle]

        // 首先判断中间的值是不是指定值
        if (middleValue == target) {
            return middle
        }

        return when {
            start >= middle -> -1
            target >= middleValue -> binSearch2(nums, target, middle + 1, end)
            else -> binSearch2(nums, target, start, middle - 1)
        }
    }
}