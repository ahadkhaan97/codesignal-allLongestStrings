fun main() {
    print(solution(mutableListOf("aba", "aa", "ad", "vcd", "aba")))
}


fun solution(inputArray: MutableList<String>): MutableList<String> {
    var maxLength = 0
    for (i in 0 until inputArray.size) {
        if (inputArray[i].length > maxLength) {
            maxLength = inputArray[i].length
        }
    }

    val longestStringList = mutableListOf<String>()

    for (i in 0 until inputArray.size) {
        if (inputArray[i].length == maxLength)
            longestStringList.add(inputArray[i])
    }

    return longestStringList
}
