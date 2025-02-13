package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    var entrada_x = readlnOrNull()?.toDoubleOrNull()
    println("Ingresa y:")
    var entrada_y = readlnOrNull()?.toIntOrNull()
    var contador = 1
    while (entrada_y!! > entrada_x!!) {
        entrada_x *= 1.1
        contador ++
    }
    println("Necesitas $contador días para correr bien los $entrada_y Km")
}