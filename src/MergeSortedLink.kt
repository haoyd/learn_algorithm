object MergeSortedLink {

    @JvmStatic
    fun main(args: Array<String>) {
        val l1 = ListNode(1)
        l1.next = ListNode(2)
        l1.next!!.next = ListNode(3)

        val l2 = ListNode(2)
        l2.next = ListNode(3)
        l2.next!!.next = ListNode(4)

        var result = mergeTwoList(l1, l2)
        while (result != null) {
            println(result.value)
            result = result.next
        }
    }

    /**
     * 合并有序链表
     * 1>2>3
     * 2>3>4
     * 1>2>2>3>3>4
     */
    private fun mergeTwoList(l1: ListNode, l2: ListNode): ListNode? {
        var index1: ListNode? = l1          // l1 指针
        var index2: ListNode? = l2          // l2 指针
        var head: ListNode? = null          // 头部指针
        var merger: ListNode? = null        // 用来操作排序

        while (index1 != null || index2 != null) {
            /**
             * 如果遍历完 l1，则把 l2 的元素插入进来
             */
            if (index1 == null && index2 != null) {
                if (merger == null) {
                    merger = index2
                    head = index2
                } else {
                    merger.next = index2
                    merger = index2
                }

                index2 = index2.next
                continue
            }

            /**
             * 如果遍历完 l2，则把 l1 的元素插入进来
             */
            if (index2 == null && index1 != null) {
                if (merger == null) {
                    merger = index1
                    head = index1
                } else {
                    merger.next = index1
                    merger = index1
                }

                index1 = index1.next
                continue
            }


            /**
             * 比较大小，按需所取
             */
            if (index1 != null && index2 != null) {
                if (index1.value >= index2.value) {
                    if (merger == null) {
                        head = index2
                        merger = index2
                    } else {
                        merger.next = index2
                        merger = index2
                    }

                    index2 = index2.next
                } else {
                    if (merger == null) {
                        head = index1
                        merger = index1
                    } else {
                        merger.next = index1
                        merger = index1
                    }

                    index1 = index1.next
                }
            }
        }

        return head
    }

    class ListNode(
        var value: Int = 0,
        var next: ListNode? = null
    )
}