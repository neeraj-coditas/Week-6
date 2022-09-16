package com.example.week6

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApp: Application() {
    @Inject lateinit var shapeInfo: ShapeInfo


    override fun onCreate() {
        super.onCreate()
        Log.d("MyShape","App Started")
        getInfo()
    }


    fun getInfo(){
        shapeInfo.shape(10)
    }

}