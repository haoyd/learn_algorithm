/**
 * 找到最长连续字符
 */
object 找到连续的字符 {

    @JvmStatic
    fun main(args: Array<String>) {
        val str = "abcdabc"

        if (str.isEmpty()) {
            return
        }

        var separatedStr = ""

        for (i in str.indices) {
            if (i == 0) {
                separatedStr += str[i]
                continue
            }

            // 关键是对比 2 个字符的 ASCII 码是否相邻
            if (str[i].toInt() != str[i - 1].toInt() + 1) {
                separatedStr += ","
            }
            separatedStr += str[i]
        }

        val strList = separatedStr.split(",")

        var maxStr = ""
        for (str in strList) {
            if (str.length > maxStr.length) {
                maxStr = str
            }
        }

        println(maxStr)
    }
}