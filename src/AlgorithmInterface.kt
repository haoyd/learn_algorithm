interface AlgorithmInterface {
    fun run(array: IntArray)

    fun printList(array: IntArray) {
        println("排序后的结果：")
        for (x in array) {
            print("$x ")
        }
    }
}