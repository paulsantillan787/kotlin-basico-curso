fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val sumaRes = suma(firstNumber, secondNumber)
    val restaRes = resta(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $sumaRes")
    println("$firstNumber - $thirdNumber = $restaRes")
}

fun suma(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun resta(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}