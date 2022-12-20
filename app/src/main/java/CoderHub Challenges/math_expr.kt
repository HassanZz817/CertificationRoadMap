package `CoderHub Challenges`


fun math_expr( expr: String):Boolean {
    val operations = setOf("+", "-", "*", "/")
    val tokens = expr.split(" ")

    if (tokens.size != 3) {
        return false
    }

    val firstNumber = tokens[0].toDoubleOrNull()
    val secondNumber = tokens[2].toDoubleOrNull()

    if (firstNumber == null || secondNumber == null) {
        return false
    }

    return tokens[1] in operations
}
fun main(){
    println(math_expr("2 + 3")) // prints "true"

}
