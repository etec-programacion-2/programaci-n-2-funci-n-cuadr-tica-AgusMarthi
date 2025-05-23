package org.example

import kotlin.math.sqrt  // importo esta librería para poder sacar la raiz cuadrada de la discriminante

fun main() {

    // Le agrego los valores a las variables a, b, y c

    val a = 2.0
    val b = 3.0
    val c = -5.0

    //ejecuto las funciones dándoles como parámetro las variables a, b, y c

    cuadratica(a, b, c) 
    resolución(a, b, c) 
    raices(a, b, c) 
}

fun cuadratica(a : Double, b : Double, c : Double){  // Función que muestra la función cuadrática
    if (a != 0.0){
        println("La función ingresada es = ${a}x² + ${b}x + ${c}\n")
    } else{
        println("La variable a no muede ser 0\n")
    }
}

fun resolución(a : Double, b : Double, c : Double){  // Función que muestra la resolucion de la función cuadrática
    val x = listOf(-3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0)
    println("Los valores de X son = $x\n")
    for (i in x){  // Cálculo para sacar el valor de f(x) con cada valor de la lista x
        var fx = a * i * i + b * i + c  
        println("Para X = $i, el resultado queda f(x) = $fx")
    }
}

fun raices(a : Double, b : Double, c : Double){  // Función que muestra las raices de la cuadrática
    val discriminante = b * b - 4.0 * a * c
    var xuno = (-b + sqrt(discriminante))/ 2 * a  // Cálculo para sacar x1
    var xdos = (-b - sqrt(discriminante))/ 2 * a  // Cálculo para sacar x2
    if (discriminante < 0){
        println("\nTiene raíces imaginarias, X1 = $xuno, X2 = $xdos")  //En caso de que las raices no existan
    }elif (discriminante = 0){
        println("\nTiene una sola raiz real que es igual a $xuno)  //En caso de que las raices sean iguales
    }else (discriminante > 0){
        println("\nTiene dos raíces reales, X1 = $xuno, X2 = $xdos")  //En caso de que las raices existan y sean distintas
    }
}