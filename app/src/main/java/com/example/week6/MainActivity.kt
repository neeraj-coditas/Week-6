package com.example.week6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.week6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainBtn1.setOnClickListener {
            val i = Intent(this, DependencyInjectionImple::class.java)
            startActivity(i)
        }

        binding.mainBtn2.setOnClickListener {
            val i = Intent(this, DiWithHilt::class.java)
            startActivity(i)
        }

        binding.mainBtn3.setOnClickListener {
            val i = Intent(this, Day3::class.java)
            startActivity(i)
        }

        binding.mainBtn4.setOnClickListener {
            val i = Intent(this, Day4::class.java)
            startActivity(i)
        }
    }


}