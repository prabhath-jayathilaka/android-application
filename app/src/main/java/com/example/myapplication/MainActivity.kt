package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun visitNextUI(view: View?){
        Log.d("fun","In Function")
        val  gotToNextScreen = Intent(applicationContext,SecondScreen::class.java)
        startActivity(gotToNextScreen)

    }
}

