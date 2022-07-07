
object 二分查找换序位置 {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(3, 4, 5, 1, 2)
        val target = 1
        val index = findTarget(intArray, target)
        println("您找的是第 $index 个元素")
    }

    private fun findTarget(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1

        val startValue = nums[0]

        while (start <= end) {
            val middle = (end - start) / 2 + start
            val middleValue = nums[middle]

            if (target == middleValue) {
                return middle
            }

            if (target < middleValue) {
                if (target < startValue) {
                    start = middle + 1
                } else {
                    end = middle - 1
                }
            } else {
                start = middle + 1
            }

        }

        return -1
    }
}