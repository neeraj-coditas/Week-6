package com.example.week6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.week6.databinding.ActivityDay4Binding
import com.example.week6.retrofit.RetrofitActivity

class Day4 : AppCompatActivity() {
    lateinit var binding : ActivityDay4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_day4)

        val crashButton = Button(this)
        binding.crashButton.text = "Test Crash"
        binding.crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }

        binding.retroButton.setOnClickListener {
            startActivity(Intent(this, RetrofitActivity::class.java))
        }

    }
}