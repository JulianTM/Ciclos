package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    var guardar = 0
    var suma = 0
    while (true) {
        println("n:")
        val n = readlnOrNull()?.toIntOrNull()
        if (n!! ==0){
            println("Posición del mayor = $suma")
            break
        }
        if (n > guardar){
            guardar = n
            suma++
        }
    }
}