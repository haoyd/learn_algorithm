object 排序__快速排序{

    @JvmStatic
    fun main(args: Array<String>) {
        sort(unOrderedArray, 0, unOrderedArray.size - 1)
        printIntArray(unOrderedArray)
    }

    /**
     * 排序
     * @param a
     * @param start
     * @param end
     */
    private fun sort(a: IntArray, start: Int, end: Int) {
        if (start > end) {
            //如果只有一个元素，就不用再排下去了
            return
        }

        //如果不止一个元素，继续划分两边递归排序下去
        val partition = divide(a, start, end)
        sort(a, start, partition - 1)
        sort(a, partition + 1, end)
    }

    /**
     * 将数组的某一段元素进行划分，小的在左边，大的在右边
     * @param a
     * @param start
     * @param end
     * @return
     */
    private fun divide(a: IntArray, start: Int, end: Int): Int {
        var start = start
        var end = end

        //每次都以最右边的元素作为基准值
        val base = a[end]

        //start一旦等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循环。
        while (start < end) {
            //从左边开始遍历，如果比基准值小，就继续向右走
            while (start < end && a[start] <= base) start++

            //上面的while循环结束时，就说明当前的a[start]的值比基准值大，应与基准值进行交换
            if (start < end) {
                //交换
                val temp = a[start]
                a[start] = a[end]
                a[end] = temp

                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值右边)，因此右边也要同时向前移动一位
                end--
            }

            //从右边开始遍历，如果比基准值大，就继续向左走
            while (start < end && a[end] >= base) end--

            //上面的while循环结束时，就说明当前的a[end]的值比基准值小，应与基准值进行交换
            if (start < end) {
                //交换
                val temp = a[start]
                a[start] = a[end]
                a[end] = temp

                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值左边)，因此左边也要同时向后移动一位
                start++
            }
        }

        //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
        return end
    }


}