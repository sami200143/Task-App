package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskapp.MainActivity
import kotlinx.coroutines.*

class SplashScreen : AppCompatActivity() {


    private val splashScreenDuration: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_splash)


        GlobalScope.launch {
            delay(splashScreenDuration)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }
}

