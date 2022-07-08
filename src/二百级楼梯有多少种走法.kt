/**
 * 200 级楼梯，每次能上一级或两级台阶，有多少种走法
 */
object 二百级楼梯有多少种走法 {

    @JvmStatic
    fun main(args: Array<String>) {
        val num = findWay(7)
        print("结果为：$num")

    }

    private fun findWay(num: Int): Int {
        if (num <= 2) {
            return num
        }

        var last1 = 1
        var last2 = 2
        var count = 0

        for (i in 3..num) {
            count = last1 + last2
            last1 = last2
            last2 = count
        }

        return count
    }
}