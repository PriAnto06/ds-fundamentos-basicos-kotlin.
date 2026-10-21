package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    return (1..n).sum()
}

fun contarPares(inicio: Int, fin: Int): Int {
    return (inicio..fin).count{ it % 2 ==0}
}

fun fibonacci(n: Int): Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    var a = 0
    var b = 1
    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }
    return b
}

fun factorial(n: Int): Int {
    return (1..n).fold(1) { acc, i -> acc * i }
}

fun encontrarMaximo(numeros: List<Int>): Int {
    return numeros.maxOrNull() ?: throw IllegalArgumentException("La lista no puede estar vacía")
}

fun encontrarMinimo(numeros: List<Int>): Int {
    TODO("Encontrar el valor minimo en la lista")
}

fun sumarLista(numeros: List<Int>): Int {
    TODO("Sumar todos los elementos de la lista")
}

fun inverter(texto: String): String {
    TODO("Invertir la cadena de texto")
}

fun contarVocales(texto: String): Int {
    TODO("Contar las vocales en el texto (considerar mayusculas y minusculas)")
}

fun esPalindromo(texto: String): Boolean {
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    TODO("Retornar lista con la tabla de multiplicar del 1 al 10")
}
