package com.example.certificationroadmap


import java.util.*

/**
 * Method to count no. of words in provided String
 */
fun countWords(txt: String): Int {
    //Split String by Space
    val strArray = txt.split(" ".toRegex()).toTypedArray() // Spilt String by Space
    val sb = StringBuilder()
    var count = 0

    //iterate String array
    for (s in strArray) {
        if (s != "") {
            //Increase Word Counter
            count++
        }
    }
    return count
}


//Main function, entry point of program
fun main(){
    countWords("hello wold")
}
