import kotlin.math.pow
fun main() {
    println("Введите целое число: ")
    var n = readln().toInt()
    println("Введите основание степени: ")
    var y = readln().toDouble()
    var x = 0
    var degree = 1
    if (y > 1){
        while (degree < n) {
            x++
            degree = y.toDouble().pow(x.toDouble()).toInt()
        }
        if (degree == n) {
            println("Существует: x = $x")
        } else {
            println("Целочисленный показатель не существует.")
        }
    } else {
        println("Основание степени не может быть меньше либо равно одному")
    }
}