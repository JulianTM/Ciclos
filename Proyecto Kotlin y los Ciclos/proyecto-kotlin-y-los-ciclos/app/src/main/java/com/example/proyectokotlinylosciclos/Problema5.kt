package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    var contador = 0
    while (true) {
        println("n:")
        val n = readlnOrNull()?.toIntOrNull()
        if (n!! ==-1){
            println("Pares = $contador")
            break
        }
        if (n%2== 0){
            contador ++
        }
    }
}