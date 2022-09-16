package com.example.week6.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.week6.NewsService
import com.example.week6.R
import retrofit2.Call
import retrofit2.Response

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        getNews()
    }

    private fun getNews() {
        val news = NewsService.newsInstance.getHeadlines("in",1)
        news.enqueue(object: retrofit2.Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {
                val news = response.body()
                if(news!=null)
                    Log.d("Neeraj",news.toString())
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d("Neeraj","Error in fetching")
            }
        })
    }
}