import java.util.*

object 二叉__遍历树 {
    @JvmStatic
    fun main(args: Array<String>) {
        /**
            1
          2   3
         4 5 6  7
         */

        val node4 = BinTreeNode(4)
        val node5 = BinTreeNode(5)
        val node6 = BinTreeNode(6)
        val node7 = BinTreeNode(7)

        val node2 = BinTreeNode(2, node4, node5)
        val node3 = BinTreeNode(3, node6, node7)

        val node1 = BinTreeNode(1, node2, node3)

        val deepList = deepFind(node1)
        printIntList(deepList)

        val wideList = wideFind(node1)
        printIntList(wideList)
    }

    /**
     * 深度优先遍历
     *
     * 主要思想：
     * 1、遍历整个二叉树
     * 2、越后取出来的越先存入栈中，利用栈的"先进后出"原则
     * 3、遍历完深度后再回过头来遍历之前存的广度元素
     */
    private fun deepFind(root: BinTreeNode): List<Int> {
        val list = mutableListOf<Int>()
        val stack = Stack<BinTreeNode>()
        stack.push(root)

        while (!stack.isEmpty()) {
            val node = stack.pop()

            if (node.hasRight) {
                stack.push(node.right)
            }

            if (node.hasLeft) {
                stack.push(node.left)
            }

            list.add(node.value)
        }

        return list
    }

    /**
     * 广度遍历
     *
     * 主要思想：
     * 1
     */
    private fun wideFind(root: BinTreeNode): List<Int> {
        val list = mutableListOf<Int>()
        val queue = LinkedList<BinTreeNode>()
        queue.push(root)

        while (!queue.isEmpty()) {
            val node = queue.pop()

            if (node.hasLeft) {
                queue.add(node.left!!)
            }

            if (node.hasRight) {
                queue.add(node.right!!)
            }

            list.add(node.value)
        }

        return list
    }
}