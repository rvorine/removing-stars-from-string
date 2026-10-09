fun removeStars(s: String): String {
    val stack = StringBuilder()
    for (ch in s) {
        if (ch == '*') {
            stack.deleteCharAt(stack.length - 1)
        } else {
            stack.append(ch)
        }
    }
    return stack.toString()
}

fun main() {
    println(removeStars("leet**cod*e")) // lecoe
    println(removeStars("erase*****"))  // (empty string)
}
