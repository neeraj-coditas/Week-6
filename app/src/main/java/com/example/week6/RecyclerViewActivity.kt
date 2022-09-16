package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week6.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding:ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycler_view)

        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Hello","Just a Description"))
        songsObjects.add(Song("ABCD","Movie"))
        songsObjects.add(Song("Dance","Track"))
        songsObjects.add(Song("Chill","Soothing"))
        songsObjects.add(Song("Coder's Life","Programming 101"))
        songsObjects.add(Song("Photograph","Jaden Smith"))
        songsObjects.add(Song("Out Of Time","The Weeknd"))
        songsObjects.add(Song("Gasoline","The Weeknd"))
        songsObjects.add(Song("Starboy","The Weeknd"))
        songsObjects.add(Song("Dusk Till Dawn","ZAYN and SIA"))
        songsObjects.add(Song("Glimpse of Us","joji"))
        songsObjects.add(Song("Cruel","ZAYN"))
        songsObjects.add(Song("Bade Achein lagte Hai","Retro"))

        binding.songList.adapter = MyAdapter(songsObjects)
        binding.songList.layoutManager = LinearLayoutManager(this)



    }
}