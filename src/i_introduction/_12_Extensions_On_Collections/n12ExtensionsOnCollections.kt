package i_introduction._12_Extensions_On_Collections

import util.TODO
import util.doc12
import java.lang.StringBuilder

fun todoTask12(): Nothing = TODO(
        """
        Task 12.
        Kotlin standard library contains lots of extension functions that make the work with collections more convenient.
        Rewrite the previous example once more using an extension function 'sortedDescending'.

        Kotlin code can be easily mixed with Java code.
        Thus in Kotlin we don't introduce our own collections, but use standard Java ones (slightly improved).
        Read about read-only and mutable views on Java collections.
    """,
        documentation = doc12()
)

fun task12(): List<Int> {
    return arrayListOf(1, 5, 2).sorted().asReversed()
}

fun isPrime(number: Int): Boolean {
    for (i in 2 until number)
        if (number % i == 0)
            return false
    return true
}


fun getPrimes(number: String): List<Int> {
    val num = number.toInt(10)
    val primes = ArrayList<Int>()

    for (i in 2..num)
        when(isPrime(i)) {
            true -> primes.add(i)
        }

    return primes
}

fun primesAsString(number: String): String {
    var sb = StringBuilder("")
    for (prime in getPrimes(number))
        sb.append("$prime ")

    return sb.toString()
}
