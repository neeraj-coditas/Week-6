package com.example.week6

import javax.inject.Inject

class ShapeInfo @Inject constructor(
    val myPerimeter: MyPerimeter,
    val myArea: MyArea ) {

    fun shape(length:Int){
        myArea.area(length)
        myPerimeter.perimeter(length)
    }


}