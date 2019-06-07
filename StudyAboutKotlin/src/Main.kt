/*
2019/06/07 started
内容:Kotlinの基礎文法

*/

fun main(args: Array<String>) {
    println("Hello,World!")
    println(max(1, 2))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
