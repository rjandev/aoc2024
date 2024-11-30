package dev.rjan.aoc2024

fun readInputFile(fileName: String): String {
    return {}.javaClass.getResource("/input/$fileName/$fileName.txt")?.readText()
        ?: throw IllegalArgumentException("Could not read file /input/$fileName/$fileName.txt")
}
