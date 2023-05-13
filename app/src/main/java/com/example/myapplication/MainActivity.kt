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
        val bundle = Bundle()
         bundle.putString("name","This Is user Name")
         bundle.putString("email","example@mail.com")

        Log.d("fun","In Function")
        Log.d("fun",bundle.getString("name").toString())

        val  gotToNextScreen = Intent(applicationContext,SecondScreen::class.java)
        gotToNextScreen.putExtras(bundle)
        startActivity(gotToNextScreen)

    }
}

