/*
2019/06/07 started
内容:Kotlinの基礎文法

*/

class Person(
    val name: String,
    var isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    println("Hello,World!")
    println("fun max result => " + max(1, 2))

    val languages = arrayListOf<String>("Java")
    languages.add("Kotlin")

    val person = Person("Bob", true)
    println("person.name => " + person.name)
    println("peeson.isMarried => " + person.isMarried)

    val rectangle = Rectangle(41, 43)
    println("isRectangle? => " + rectangle.isSquare)

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
