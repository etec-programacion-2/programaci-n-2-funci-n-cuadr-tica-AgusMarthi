package org.example


fun main() {
    val a = 2.0
    val b = 3.0
    val c = -5.0
    val x = 2.0
    if (a != 0.0) {
        cuadratica(a, b, c, x)
    }
}
fun cuadratica(a : Double, b : Double, c : Double, x : Double) {
    if (c > 0.0){
        println("El valor de a es = $a" /n "$a x² + $b x + $c")
    }else println("$a x² + $b x $c")
}