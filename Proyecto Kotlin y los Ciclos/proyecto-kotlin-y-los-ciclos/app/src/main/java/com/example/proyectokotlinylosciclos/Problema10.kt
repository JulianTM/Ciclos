package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 10 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
// Desarrolle aquí la lógica
    println("n:")
    val n = readlnOrNull()?.toIntOrNull()
    var imagen=""
    if (n!! <=0 || n >9){
        println("Error")
    }else{
        for (i in 1..n){
            imagen += "$i"
            println(imagen)
        }
    }
}