package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2
import java.lang.StringBuilder

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloaded 'foo' functions in the class 'JavaCode3' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add 'foo' parameters and implement its body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo(name: String, number: Number = 42, toUpperCase: Boolean = false): String {
    /**
     * using var as reassignment is required at a later point.
     */
    var res = StringBuilder(name)
    /**
     * `if` is an expression, i.e. it returns a value.
     * Therefore there is no ternary operator (condition ? then : else),
     * because ordinary `if` works fine in this role.
     * See http://kotlinlang.org/docs/reference/control-flow.html#if-expression
     */
    if(toUpperCase) {
        res = StringBuilder(name.toUpperCase())
    }
    res.append(number)
    return res.toString()
}

fun task3(): String {
    return (foo("a") +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}