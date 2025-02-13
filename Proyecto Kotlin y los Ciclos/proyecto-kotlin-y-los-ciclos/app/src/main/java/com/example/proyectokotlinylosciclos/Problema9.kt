package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    var guardar = 0
    var multiplicacion = 1
    println("n:")
    val n = readlnOrNull()?.toIntOrNull()
    if (n!! <=0){
        println("Error")
    }else{
        for (i in 1..n){
            multiplicacion *= i
            guardar += multiplicacion
        }
        println("s = $guardar")
    }


}