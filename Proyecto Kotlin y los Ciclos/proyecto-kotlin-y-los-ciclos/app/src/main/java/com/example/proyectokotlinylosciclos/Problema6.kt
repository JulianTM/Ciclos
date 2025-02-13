package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("A:")
    val A = readlnOrNull()?.toIntOrNull()
    println("B:")
    val B = readlnOrNull()?.toIntOrNull()
    if (A!! < B!!) {
        for (i in A..B) {
            print("$i ")
        }
    }
    if (A > B){
        for (i in A downTo B){
            print("$i ")
        }
    }
    if (A==B){
        print("$A ")
    }

}