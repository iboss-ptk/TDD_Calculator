fun calculate(expression: String): String {
    if (expression.indexOf('+') > 0) {
        val whatever = expression.split("+").map { it.trim().toInt() }
        return "${whatever[0]+whatever[1]}"
    }
    if (expression.indexOf('*') > 0) {
        val whatever = expression.split("*").map { it.trim().toInt() }
        return "${whatever[0]*whatever[1]}"
    }
    val whateverMinus = expression.split("-").map { it.trim().toInt() }
    return "${whateverMinus[0]-whateverMinus[1]}"
}