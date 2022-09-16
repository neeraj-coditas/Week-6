package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DiWithHilt : AppCompatActivity() {

    @Inject lateinit var shapeInfo: ShapeInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_di_with_hilt)

        shapeInfo.shape(5)
    }
}