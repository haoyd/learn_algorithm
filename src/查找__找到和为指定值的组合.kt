/**
 * 给定一个有序不重复数组，使用时间复杂度小于N方的方法，找到所有两两相加等于target值的组合
 *
 * 整体思路：
 * 1、前后 2 个指针分别一点点向中间移动
 * 2、一边等待，另一边向内移动
 * 3、如果小于目标则左指针移动；如果大于目标则右指针移动；如果等于目标则两个都移动
 */
object 查找__找到和为指定值的组合 {

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        var start = 0
        var end = arr.size - 1

        val target = 7

        val result = mutableListOf<IntArray>()

        while (start < end) {
            when {
                arr[start] + arr[end] < target -> start++
                arr[start] + arr[end] > target -> end--
                else -> {
                    result.add(intArrayOf(arr[start], arr[end]))
                    start++
                    end--
                }
            }
        }

        for (ints in result) {
            println(ints.joinToString(","))
        }
    }
}