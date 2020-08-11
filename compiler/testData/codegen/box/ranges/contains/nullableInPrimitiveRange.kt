// WITH_RUNTIME

val x: Int? = 42
fun xFun(): Int? = 42

val n: Int? = null
val nProp: Int?
    get() = null

fun box(): String {
    if (x in 0..2) return "Fail in"
    if (!(x !in 0..2)) return "Fail !in"

    if (xFun() in 0..2) return "Fail in function"
    if (!(xFun() !in 0..2)) return "Fail !in function"

    if (n in 0..2) return "Fail in null"
    if (!(n !in 0..2)) return "Fail !in null"

    if (nProp in 0..2) return "Fail in null property"
    if (!(nProp !in 0..2)) return "Fail !in null property"

    return "OK"
}