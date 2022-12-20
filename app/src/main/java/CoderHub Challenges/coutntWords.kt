package `CoderHub Challenges`


fun countWords( txt: String): Int {
    val words = txt.split(" ")
    var count = 0
    for (word in words) {
        if (word.toIntOrNull() != null) {
            count++
        }
    }
    return count
}

fun main(){
    countWords("hassan")
}

