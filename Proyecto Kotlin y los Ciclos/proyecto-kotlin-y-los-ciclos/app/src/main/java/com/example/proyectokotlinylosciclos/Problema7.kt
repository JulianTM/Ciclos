package com.example.proyectokotlinylosciclos
import kotlin.math.pow

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("N:")
    val n = readlnOrNull()?.toIntOrNull()
    var suma = 0.0
    for (i in 1..n!!){
        suma += i.toDouble().pow(3)
    }
    if (suma.toInt() == 0){
        println("Error")
    }else{
        println("s = ${suma.toInt()}")
    }
}