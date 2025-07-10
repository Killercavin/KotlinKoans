package koans.introduction

/*
Named Arguments

- Make the function joinOptions() return the list in a JSON format (for example, [a, b, c]) by specifying only two arguments.

fun joinOptions(options: Collection<String>) =
        options.joinToString(TODO())
 */

// solution
fun joinOptions(options: Collection<String>): String =
    options.joinToString(prefix = "[", postfix = "]")

fun main() {
    val test = joinOptions(listOf("one", "two", "three"))
    println(test)
}