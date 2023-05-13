package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SecondScreen : AppCompatActivity() {
    private lateinit var myMusic: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interface_two)
        myMusic = MediaPlayer.create(this,R.raw.song)
        myMusic.start()
    }

    override fun onPause() {
        super.onPause()
        myMusic.pause()

    }

    override fun onPostResume() {
        super.onPostResume()
        myMusic.start()
    }
}