/*
study grammar of Kotlin
2019/04/12 start

 */

fun main() {
    println("helloKotolin")
    var a: Int = 1000//変数
    val b: Int = 2000//定数
    val str: String = """Oh
    Have a
            nice Kotlin"""
    println(str)
    val str2: String = """
        |Oh
        |Have a
        |nice Kotlin""".trimMargin()
    println(str2)

    println("a=$a")
    val s: String = "Kotlin"
    println("$s length is ${s.length} words")
    val str3: String = "123"
    val intstr3 = str3.toInt()
    println("str3=$intstr3")
    str2.toIntOrNull()//例外発生せず

}