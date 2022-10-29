package com.example.certificationroadmap

fun main() {
    val numbers = listOf<Int>(0, 3, 4, 8, 4, 0, 5, 5, 8, 9, 2)
    println("List: ${numbers}")
    //ascending order //
    println("Sorted: ${numbers.sorted()}")
// //
// can't be any duplicates//
    val setOfNumbers = numbers.toSet()
    println("set: {$setOfNumbers}")
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 6, 9)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
    println("${set1.intersect(set2)}")
    println("${set1.union(set2)}")
    println("----------------------")
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Hassan", 22)
    peopleAges["Fred"] = 31
    println(peopleAges)
//    peopleAges.forEach{ println("${it.key} is ${it.value},")}
//    for(people in peopleAges){
//        println(people.key + people.value)
//    }
    println(peopleAges.map {" ${it.key} is ${it.value}" }.joinToString(","))
    val filterdNames = peopleAges.filter { it.key.length < 4 }
    println(filterdNames)
}