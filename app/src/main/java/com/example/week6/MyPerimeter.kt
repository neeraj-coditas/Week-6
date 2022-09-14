package com.example.week6

import android.util.Log
import javax.inject.Inject

class MyPerimeter @Inject constructor(){

    fun perimeter(length:Int){
        Log.d("MyShape",(length*4).toString())
    }
}