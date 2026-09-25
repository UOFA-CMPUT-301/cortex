package com.example.cortex

import androidx.compose.remote.creation.compose.state.pow

abstract class Shape (
    var x: Int,
    var y: Int,
    val color: String
)

class Hexagon(posx: Int, posy: Int, sideLen: Double): Shape(posx,posy,"blue") {
    fun area(): Double {
        return 3*(3.pow(1/2))/2 * sideLen.pow(2)
    }

    fun perimeter(): Double {
        return 6*sideLen
    }
}