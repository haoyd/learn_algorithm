/**
 * 输入：s = ['h','e','l','l','o']
 * 输出：['o','l','l','e','h']
 */
object 反转字符串 {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(arr)
        printCharArray(arr)
    }

    private fun reverseString(arr: CharArray) {
        var start = 0
        var end = arr.size - 1

        while (start < end) {
            val temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp

            start++
            end--
        }
    }
}