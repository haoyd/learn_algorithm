fun printIntArray(array: IntArray) {
    for (i in array.indices) {
        val item = array[i]

        if (i < array.size - 1) {
            print("$item, ")
        } else {
            print("$item")
        }
    }

    println()
}

fun printIntList(list: List<Int>) {
    for (i in list.indices) {
        val item = list[i]

        if (i < list.size - 1) {
            print("$item, ")
        } else {
            print("$item")
        }
    }

    println()
}

