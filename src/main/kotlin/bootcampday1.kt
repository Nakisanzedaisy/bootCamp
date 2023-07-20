import java.time.LocalDate
import kotlin.math.sqrt
fun main() {
    val currentYear = LocalDate.now().year
    val birthYear = 2001
    val age = currentYear - birthYear
    println("I am $age years old.")


    //for another qn


        val base = 4.0
        val height = 3.0
        val hypotenuse = sqrt(base * base + height * height)
        println("The hypotenuse of the triangle is $hypotenuse cm.")

}
