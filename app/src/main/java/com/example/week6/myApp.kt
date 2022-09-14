package com.example.week6

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class myApp: Application() {
    @Inject lateinit var shapeInfo: ShapeInfo


    override fun onCreate() {
        super.onCreate()
        getInfo()
        Log.d("MyShape","App Started")
    }


    fun getInfo(){
        shapeInfo.shape(10)
    }


}