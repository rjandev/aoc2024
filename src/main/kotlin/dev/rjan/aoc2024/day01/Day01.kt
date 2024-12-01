package dev.rjan.aoc2024.day01

import dev.rjan.aoc2024.readInputFile
import kotlin.math.abs

fun main() {
    print(part1())
    println()
    print(part2())
}

fun part1(): Any {
    var (left, right) = parseInput()
    left.sort()
    right.sort()
    var totalDist = 0
    for ((left, right) in left.zip(right)) {
        totalDist += abs(left - right)
    }
    return totalDist
}

fun part2(): Any {
    var (left, right) = parseInput()
    var totalSum = 0
    for (number in left) {
        var count = right.count { i -> i == number }
        totalSum += number * count
    }
    return totalSum
}

private fun parseInput(): Pair<ArrayList<Int>, ArrayList<Int>> {
    var lines = readInputFile("day01").lines()
    var left = ArrayList<Int>()
    var right = ArrayList<Int>()
    for (line in lines) {
        left.add(line.split("   ")[0].toInt())
        right.add(line.split("   ")[1].toInt())
    }
    return Pair(left, right)
}