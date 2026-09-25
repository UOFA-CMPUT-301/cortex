package com.example.cortex


import androidx.compose.remote.creation.compose.state.pow

abstract class Shape (
    var x: Int,
    var y: Int,
<<<<<<< HEAD
    val color: String = "cyan"
=======
    val color: String = "Red"
>>>>>>> 4741b912726c1eca15c20374dd29a34822afc537
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
