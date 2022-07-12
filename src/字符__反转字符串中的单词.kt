import java.lang.StringBuilder

/**
 * 输入： s = "God Ding"
 * 输出："doG gniD"
 */
object 字符__反转字符串中的单词 {
    @JvmStatic
    fun main(args: Array<String>) {

        val str = "God Ding"
        val newStr = reverseWords(str)
        print(newStr)
    }

    /**
     * 主要思路：
     * 1、记录空格的位置
     * 2、每次插入时都向空格的下一个位置插入字符
     */
    fun reverseWords(s: String): String {
        val sb = StringBuilder()

        var index = 0
        var spaceIndex = 0

        while (index < s.length) {
            if (s[index] == ' ') {
                sb.append(" ")
                spaceIndex = index + 1
            } else {
                sb.insert(spaceIndex, s[index])
            }

            index++
        }

        return sb.toString()
    }
}