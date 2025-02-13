package com.example.proyectokotlinylosciclos

import kotlin.math.pow

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readlnOrNull()?.toIntOrNull()
    var multiplicacion = 1
    if (n!! < 0){
        println("Error")
    } else{
        for (i in 1..n){
            multiplicacion *= i
        }
        println("$n ! = $multiplicacion")
    }
}