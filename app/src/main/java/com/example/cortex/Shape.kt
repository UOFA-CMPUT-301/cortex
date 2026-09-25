package com.example.cortex

open class Shape (
    var x: Int,
    var y: Int,
    val color: String = "cyan"
)

class Rhombus(x: Int, y: Int): Shape(x,y) {
}