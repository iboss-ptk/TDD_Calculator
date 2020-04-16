fun calculate(expression: String): String {
    val whatever = expression.split(" + ").map { it.toInt() }
    return "${whatever[0] + whatever[1]}"
}