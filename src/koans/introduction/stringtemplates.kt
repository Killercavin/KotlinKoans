package koans.introduction

/*
String templates

- Triple-quoted strings are not only useful for multiline strings but also for creating regex patterns as you don't need to escape a backslash with a backslash.
- The following pattern matches a date in the format 13.06.1992 (two digits, a dot, two digits, a dot, four digits)
ie fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = TODO()
 */

// solution
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String =
    """
        \d{2}.\d{2}.\d{4}
    """ // having problem with this Regex so the test is failing...

fun main() {
    println(getPattern())
}