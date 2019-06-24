/*
2019/06/07 started
内容:Kotlinの基礎文法

*/

class Person(
    val name: String,
    var isMarried: Boolean
)

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    println("Hello,World!")
    println("fun max result => " + max(1, 2))

    val languages = arrayListOf("Java")
    languages.add("Kotlin")

    val person = Person("Bob", true)
    println("person.name => " + person.name)
    println("peeson.isMarried => " + person.isMarried)

    val rectangle = Rectangle(41, 43)
    println("isRectangle? => " + rectangle.isSquare)

    println("getMnemonic => " + getMnemonic(Color.BLUE))

//    println("RED&BLUE mixed => " + mix(Color.RED, Color.BLUE)) => Exception
    println("RED&YELLOW mixed => " + mix(Color.RED, Color.YELLOW))
    println("YELLOW&RED mixed => " + mix(Color.YELLOW, Color.RED))//順番は関係しない

    println("eval() result =>" + eval(Sum(Sum(Num(1), Num(2)), Num(4))))

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/*
many kinds of eval fun

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval(e: Expr): Int =
    if (e is Num){
        e.value
    }else if(e is Sum){
        eval(e.right) + eval(e.left)
    }else{
        throw IllegalArgumentException("Unknown expression")
    }
*/

fun eval(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

/*
about while / do while

    while (condition){
        /*...*/
    }
    
    do {
       /*...*/ 
    }while (condition)

*/
