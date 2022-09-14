package com.example.week6

import android.util.Log
import javax.inject.Inject

class MyArea @Inject constructor() {

    fun area(length: Int){
        Log.d("MyShape",(length*length).toString())

    }
}