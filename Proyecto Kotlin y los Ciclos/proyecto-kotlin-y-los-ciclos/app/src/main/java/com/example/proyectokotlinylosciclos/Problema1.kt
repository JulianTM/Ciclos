package com.example.proyectokotlinylosciclos

// Nombre: Julian Torres Moreno
// Fecha:
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
// Desarrolle aquí la lógica
    println("Ingresa N:")
    val numero = readlnOrNull()?.toIntOrNull()
    var sum = 1
    while (numero!! >= sum*sum) {
        print("${sum*sum} ")
        sum ++
    }
}