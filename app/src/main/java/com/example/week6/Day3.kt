package com.example.week6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.week6.databinding.ActivityDay3Binding

class Day3 : AppCompatActivity() {

    lateinit var binding: ActivityDay3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_day3)

        binding.day3btn1.setOnClickListener{
            startActivity(Intent(this,RecyclerViewActivity::class.java))
        }


    }
}