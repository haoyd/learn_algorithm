object 链表__找中间节点 {

    @JvmStatic
    fun main(args: Array<String>) {
        val l1 = SingleLinkNode(1)
        val l2 = SingleLinkNode(2)
        val l3 = SingleLinkNode(3)
        val l4 = SingleLinkNode(4)
        val l5 = SingleLinkNode(5)

        l1.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5

        var result = middleNode(l1)

        while (result != null) {
            println(result.value)
            result = result.next
        }
    }

    fun middleNode(head: SingleLinkNode?): SingleLinkNode? {
        if (head == null) {
            return null
        }

        var index = head
        var middleIndex = head
        var times = 1

        while (index != null) {
            index = index.next
            if (times % 2 == 0) middleIndex = middleIndex?.next
            times++
        }

        return middleIndex
    }
}