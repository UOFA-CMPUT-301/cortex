package com.example.cortex


import androidx.compose.remote.creation.compose.state.pow

abstract class Shape (
    var x: Int,
    var y: Int,
    val Color: String = "Pink"
)


class Rhombus(x: Int, y: Int): Shape(x,y) {}

class Hexagon(posx: Int, posy: Int, sideLen: Double): Shape(posx,posy) {
    fun area(): Double {
        return 3*(3.pow(1/2))/2 * sideLen.pow(2)
    }

    fun perimeter(): Double {
        return 6*sideLen
    }

}
