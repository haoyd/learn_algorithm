/**
 * 单链表节点
 */
class SingleLinkNode(
    var value: Int = 0,
    var next: SingleLinkNode? = null
)

/**
 * 双链表节点
 */
class DoubleLinkNode(
    var value: Int = 0,
    var left: SingleLinkNode? = null,
    var right: SingleLinkNode? = null
)

/**
 * 二叉树节点
 */
class BinTreeNode(
    val value: Int,
    val left: BinTreeNode? = null,
    val right: BinTreeNode? = null
) {
    var hasLeft = left != null
    var hasRight = right != null
}