fun convert_time( time: String):String {
    val parts = time.split(":")
    val hours = parts[0].toInt()
    val minutes = parts[1].toInt()

    // Convert the hours to 12-hour format
    val convertedHours = if (hours == 0) {
        12
    } else if (hours > 12) {
        hours - 12
    } else {
        hours
    }

    // Determine the am/pm indicator
    val ampm = if (hours < 12) "AM" else "PM"

    // Return the formatted time string
    return "$convertedHours:$minutes $ampm"
}

fun main(){
    convert_time("10:30 ")
}