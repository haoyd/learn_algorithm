/**
 * 输出 101-200 之间有多少个素数
 *
 */
object 数字__输出素数 {

    @JvmStatic
    fun main(args: Array<String>) {
        printPrimeNum(101, 200)
    }


    /**
     * 输出素数
     *
     * 逻辑：
     * 1、大于 1
     * 2、只能被 1 和其本身整除
     * 3、start <= end
     */
    private fun printPrimeNum(start: Int, end: Int) {
        if (start < 0 || end < 0 || start > end) {
            return
        }

        for (i in start..end) {
            var count = 0
            for (j in 1..i) {
                if (i % j == 0) {
                    count++
                }
            }

            if (count == 2) {
                print("$i, ")
            }
        }
    }
}